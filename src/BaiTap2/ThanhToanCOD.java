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
public class ThanhToanCOD implements IThanhToan
{

    @Override
    public double thanhToan(int tienHang) 
    {
        double Tien=0;
        if(tienHang>200000) 
            return (tienHang-(tienHang*2/100));
        else Tien=tienHang;
        return Tien;
    }
}
