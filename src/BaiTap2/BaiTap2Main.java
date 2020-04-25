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
public class BaiTap2Main 
{
    public static void main(String[] args) 
   {
       GioHang giohang1 = new GioHang();
        giohang1.sethinhThucTT(new ThanhToanOnline());
        giohang1.them(new HangHoa("Bánh Cosy", 100000, "bánh tròn"));
        giohang1.them(new HangHoa("Bánh Gạo", 20000, "bánh dài"));
        giohang1.them(new HangHoa("Cocacola", 160000, "lon"));
        giohang1.them(new HangHoa("Kẹo Chip Chip", 50000, "hình con vật ngộ nghĩnh"));
        giohang1.them(new HangHoa("Kẹo Singum", 20000, "viên"));
        giohang1.inDS();
        System.out.println("Tổng tiền phải thanh toán: " + giohang1.thanhToan());
        
        GioHang giohang2 = new GioHang();
        giohang2 .sethinhThucTT(new ThanhToanCOD());
        giohang2.them(new HangHoa("Kẹo Socola", 200000, "viên tròn"));
        giohang2.them(new HangHoa("Kẹo dưa hấu", 70000, "hủ"));
        giohang2.them(new HangHoa("Bánh ngu cốc", 90000, "bịch"));
        giohang2.them(new HangHoa("Pepsi", 180000, "lon"));
        giohang2.them(new HangHoa("Bánh Snack", 6000, "bánh vị khoai tây"));
        giohang2.inDS();
        System.out.println("Tổng tiền phải thanh toán: " + giohang2.thanhToan());
    }
}
        
    


