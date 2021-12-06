/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DAO.NhanVienDAO;
import java.util.ArrayList;

public class ListNhanVien {

    ArrayList<NhanVien> listNhanVien;

    public ListNhanVien() {
        listNhanVien = new ArrayList<NhanVien>();
    }

    public void AddNhanVien(NhanVien nhanvien) {
        try {
            listNhanVien.add(nhanvien);
        } catch (Exception e) {

        }
    }

    public ArrayList<NhanVien> SearchById(String iD) {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        dsnv.add(NhanVienDAO.Search(iD));
        return dsnv;
    }

    public int CheckID(String iD) {
        for (NhanVien nv : listNhanVien) {
            if (nv.getID().equals(iD)) {
                return -1;
            }
        }
        return 0;
    }

    public int CheckAccount(String acc) {
        for (NhanVien nv : listNhanVien) {
            if (nv.getAccount().equals(acc)) {
                return -1;
            }
        }
        return 0;
    }

    public ArrayList<NhanVien> SearchByKhuVucList(String ma) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getKhuVuc().equals(ma)) {
                dsnv.add(listNhanVien.get(i));
            }
        }
        return dsnv;
    }

    public int GetIndex(String id) {
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void RemoveByIndex(int index) {
        try {
            if (listNhanVien.get(index) != null) {
                listNhanVien.remove(index);
            }
        } catch (Exception e) {
        }
    }

    public boolean CheckContainByIdNV(String Id) {
        try {
            for (NhanVien nv : listNhanVien) {
                if (nv.getID().equals(Id)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(ArrayList<NhanVien> listnv) {
        this.listNhanVien = listnv;
    }
}
