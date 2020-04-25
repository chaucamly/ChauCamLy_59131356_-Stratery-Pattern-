/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Cam Ly
 */
public class ThanhToanOnline implements IThanhToan
{
    @Override
    public double thanhToan(int tienHang)
    {
        int Tien;
        if(tienHang<1000000) 
            return Tien= (tienHang - (tienHang*5/100));
        else Tien = (tienHang - (tienHang*7/100));
        return Tien=0;
    }
}
