/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helpers.DatabaseHelper;
import Helpers.MessaDialogHelper;
import Models.BienLai;
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
public class BienLaiDAO {
    public static BienLai Search(String sdt)
    {
        String sql = "select * "
                + "from BIENLAI inner join KHACHHANG on BIENLAI.MAKH = KHACHHANG.MAKH "
                + "where sdt = ? ";
        try(
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement state = con.prepareStatement(sql);
                )
            {
            state.setString(1, sdt);
            ResultSet results = state.executeQuery();
            BienLai bl = new BienLai();
            while(results.next()){
                bl.setMaBL(results.getString("MABIENLAI"));
                bl.setMaKH(results.getString("MAKH"));
                bl.setNgayLap(LocalDate.parse(results.getString("NGAYLAP")));
                bl.setChiSoCu(results.getInt("CHISOCU"));
                bl.setChiSoMoi(results.getInt("CHISOMOI"));
                bl.getThanhToan();
                return bl;
            }
            throw new IOException("khong ton tai");
        } catch (Exception e) {
            MessaDialogHelper.showErrorDialog(null, e.getMessage(),"Search");
        }
        return null;
    }       
}