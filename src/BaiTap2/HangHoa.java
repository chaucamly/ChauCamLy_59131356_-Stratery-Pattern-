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
public class HangHoa 
{
    String tenHH;
    int gia;
    String moTa;
public HangHoa(String tenHH, int gia, String moTa)
{
        this.tenHH= tenHH;
        this.gia= gia;
        this.moTa= moTa;
}
public String gettenHH()
{
    return tenHH;
}
 public void setTenHH(String tenHH) 
 {
        this.tenHH = tenHH;
 }
 public int getGia() 
 {
        return gia;
 }
 public void setGia(int gia) 
 {
        this.gia = gia;
 }
  public String getMoTa() 
 {
        return moTa;
 } 
public void setMoTa(String moTa) 
{
        this.moTa = moTa;
}

    @Override
    public String toString() 
    {
        return "Tên Hàng Hóa: " + tenHH + ". "
                + "Gía hàng hóa: " + gia + ". "
                + "Mô tả hàng hóa: " + moTa + ". ";
               
    }
}

   

  
   

   

    



