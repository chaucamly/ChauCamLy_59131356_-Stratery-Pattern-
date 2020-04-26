/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.Date;

/**
 *
 * @author Cam Ly
 */
public class SinhVien 
{
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;
    public SinhVien(String hoTen, Date ngaySinh, float diemTB)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.diemTB=diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public float getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() 
    {
        return  "Họ tên sinh viên" +hoTen + ". "
                + "Ngày sinh: " + ngaySinh + ". "
                + "Điểm trung bình: " + diemTB + ". ";
    }
 }
