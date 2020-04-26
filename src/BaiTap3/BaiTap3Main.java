/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author Cam Ly
 */
public class BaiTap3Main 
{
    public static void main(String[] args) {
         ArrayList<SinhVien> ds = new ArrayList<>();
         ds.add(new SinhVien("Nguyễn Thị Lan Anh", "1/1/1999", (float) 8.5));
         ds.add(new SinhVien("Nguyễn Thị Trúc", "2/2/1999", (float) 8.0));
         ds.add(new SinhVien("Trần Thị Liễu", "5/7/1999", (float) 7.9));
    
        QLSV ql = new QLSV(ds);
        
        ql.setSoSanh(new SoSanhTheoTen());
        ql.sapXep();
        ql.inDS();
        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapXep();
        ql.inDS();
        
    }
   
}
