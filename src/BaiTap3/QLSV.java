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
public class QLSV 
{
    ArrayList<SinhVien> dsSV;
    ISoSanh soSanh;

    public QLSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    
    public void sapXep()
    {
        dsSV.sort((sv1, sv2) -> soSanh.soSanh(sv1, sv2));
    }
    
    public void inDS()
    {
        for (int i = 0; i < dsSV.size(); i++)
        {
            System.out.println(dsSV.get(i).toString());
        }
    }
}
