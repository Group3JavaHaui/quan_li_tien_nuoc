/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.NhanVien;
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
public class NhanVienDAO {
    public static int CheckUser(String account,String password)
    {
        String sql = "select * "
                + "from NHANVIEN "
                + "where ACCOUNT = ? and pass = ? ";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);)
            {
            state.setString(1, account);
            state.setString(2, password);
            ResultSet results = state.executeQuery();
            while(results.next())
            {
                boolean quyen = results.getBoolean("QUYEN");
                if(quyen)
                {
                    MessaDialogHelper.showMessageDialog(null, "You use an ADMIN account", "Login Adminitrator");
                    return 2;
                }
                else
                {
                     MessaDialogHelper.showMessageDialog(null, "You use an USER account", "Login Adminitrator");
                    return 1;
                }
            }
            return 0;
            
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Login Error");
        }
        return 0;
    }  
    public static NhanVien Search(String iD)
    {
        String sql = "select * "
                + "from NHANVIEN "
                + "where ID = ? ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, iD);
            ResultSet results = state.executeQuery();
            
            while(results.next()){
                NhanVien nv = new NhanVien();
                nv.setID(results.getString("ID"));
                nv.setHoTen(results.getString("HOTEN"));
                nv.setSDT(results.getString("SDT"));
                nv.setKhuVuc(results.getString("KHUVUC"));
                nv.setAccount(results.getString("ACCOUNT"));
                nv.setPassword(results.getString("PASS"));
                nv.setQuyen(results.getBoolean("QUYEN"));
                return nv;
            }
            throw new IOException("khong ton tai");
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Login Error");
        }
        return null;
    }
    public static ArrayList<NhanVien> GetNhanViens()
    {
        String sql = "select * from NhanVien";
        ArrayList<NhanVien> list = new ArrayList<>();
        try{
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                
            
            ResultSet results = state.executeQuery();
            
            while(results.next()){
                NhanVien nv = new NhanVien();
                nv.setID(results.getString("ID"));
                nv.setHoTen(results.getString("hoten"));
                nv.setSDT(results.getString("sdt"));
                nv.setKhuVuc(results.getString("khuvuc"));
                nv.setAccount(results.getString("account"));
                nv.setPassword(results.getString("pass"));
                nv.setQuyen(results.getBoolean("quyen"));
                list.add(nv);
            }
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"GetNhanViens");
        }
        return list;
    } 
    public static void Update(NhanVien nhanVien)
    {
        String sql = " Update NHANVIEN "
                + " Set HOTEN = ?, SDT = ?, KHUVUC = ?, ACCOUNT = ?, PASS = ?, QUYEN = ? "
                + " where ID = ?";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
                state.setString(1, String.valueOf(nhanVien.getHoTen()));
                state.setString(2, String.valueOf(nhanVien.getSDT()));
                state.setString(3, String.valueOf(nhanVien.getKhuVuc()));
                state.setString(4, String.valueOf(nhanVien.getAccount()));
                state.setString(5, String.valueOf(nhanVien.getPassword()));
                state.setBoolean(6, Boolean.valueOf(nhanVien.getQuyen()));
                state.setString(7, String.valueOf(nhanVien.getID()));
                state.executeUpdate();
                
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Update");
        }
    }
    public static void Delete(String id)
    {
        String sql = "Delete "
                + "from NhanVien "
                + "where id = ?" ;
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, id);
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Delete");
        }
    }
    
    public static void Insert(NhanVien nhanVien)
    {
        String sql = "Insert into nhanVien (id,hoten,sdt,khuvuc,account, pass, quyen) "
                + " values(?,?,?,?,?,?,?) ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, nhanVien.getID());
            state.setString(2, nhanVien.getHoTen());
            state.setString(3, nhanVien.getSDT());
            state.setString(4, nhanVien.getKhuVuc());
            state.setString(5, nhanVien.getAccount());
            state.setString(6, nhanVien.getPassword());
            state.setBoolean(7, nhanVien.getQuyen());
            state.execute();
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Insert");
        }
    }
}
