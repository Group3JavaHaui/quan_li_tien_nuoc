/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import DAO.PhanHoiDAO;
import java.util.ArrayList;

public class ListPhanHoi {
    ArrayList<PhanHoi> listPhanHoi = new ArrayList<PhanHoi>();

    public ListPhanHoi() {
    }

    public void AddNhanVien(PhanHoi ph)
    {
        try {
            listPhanHoi.add(ph);
        } catch (Exception e) {
           
        }
    }
     
    public ArrayList<PhanHoi> SearchById(String iD)
    {
        ArrayList<PhanHoi> dsph = new ArrayList<PhanHoi>();
        dsph.add(PhanHoiDAO.SearchPH(iD));
        return dsph;
    }
    public ArrayList<PhanHoi> SearchByKH(String iD)
    {
        return PhanHoiDAO.SearchKH(iD);
    }
    public int CheckID(String iD)
    {
        for (PhanHoi ph : listPhanHoi) {
                if(ph.getMaPH().equals(iD))
                {
                    return -1;
                }
            }
        return 0;
    }
    public int getIndex(String id){
        for(int i=0;i<=listPhanHoi.size();i++){
            if(listPhanHoi.get(i).getMaPH().equals(id))
                return i;
        }
        return -1;
    }
    public void RemoveByIndex(int index)
    {
        try {
            if(listPhanHoi.get(index) != null)
            {
                listPhanHoi.remove(index);
            }
        } catch (Exception e) {
        }
    }
    
    public boolean CheckContainByIdNV(String Id)
    {
        try {
            for (PhanHoi ph : listPhanHoi) {
                if(ph.getMaPH().equals(Id))
                {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<PhanHoi> getListPhanHoi() {
        return listPhanHoi;
    }

    public void setListPhanHoi(ArrayList<PhanHoi> listph) {
        this.listPhanHoi = listph;
    }
}
