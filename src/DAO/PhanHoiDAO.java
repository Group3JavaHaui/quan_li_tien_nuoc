/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.PhanHoi;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author phand
 */
public class PhanHoiDAO {
    public static ArrayList<PhanHoi> SearchKH(String maKH)
    {
        String sql = "select * "
                + "from PhanHoi  "
                + "where maKh = ? ";
        ArrayList<PhanHoi> list = new ArrayList<PhanHoi>();
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, maKH);
            ResultSet results = state.executeQuery();
            PhanHoi ph = new PhanHoi();
            while(results.next()){
                ph.setMaPH(results.getString("MaPH"));
                ph.setMaKH(results.getString("MAKH"));
                ph.setNgayPH(LocalDate.parse(results.getString("NGAYPH")));
                ph.setMoTa(results.getString("MOTA"));
                list.add(ph);
            }
            throw new IOException("khong ton tai");
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Search");
        }
        return list;
    }
    public static PhanHoi SearchPH(String maPH)
    {
        String sql = "select * "
                + "from PhanHoi"
                + "where MaPH = ? ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, maPH);
            ResultSet results = state.executeQuery();
            PhanHoi ph = new PhanHoi();
            while(results.next()){
                if(results.getString("MAKH").equals(ph));
                return ph;
            }
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Search");
        }
        return null;
    }
    
    public static void UpdateByMaPH(PhanHoi ph)
    {
        String sql = " Update PhanHoi "
                + " Set MaKH = ?, NgayPH = ?, MoTa = ? "
                + " where MaPH = ?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
                state.setString(1, String.valueOf(ph.getMaKH()));
                state.setString(2, String.valueOf(ph.getNgayPH()));
                state.setString(3, String.valueOf(ph.getMoTa()));
                state.setString(4, String.valueOf(ph.getMaPH()));
                state.executeUpdate();
                
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"UpdateByMaPH");
        }
    }
    public static ArrayList<PhanHoi> GetPhanHois()
    {
        String sql = "select * from PhanHoi";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            ResultSet results = state.executeQuery();
            ArrayList<PhanHoi> list = new ArrayList<>();
            while(results.next()){
                PhanHoi ph = new PhanHoi();
                ph.setMaPH(results.getString("MaPh"));
                ph.setMaKH(results.getString("MAKH"));
                ph.setNgayPH(LocalDate.parse(results.getString("NGAYPH")));
                ph.setMoTa(results.getString("MoTa"));
                list.add(ph);
            }
            return list;
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetPhanHois");
        }
        return null;
    }
    
  
    public static void DeleteByMaPH(String ma)
    {
        String sql = "Delete "
                + "from PhanHoi "
                + "where Maph = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, ma);
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"DeleteByMaPH");
        }
    }
}
