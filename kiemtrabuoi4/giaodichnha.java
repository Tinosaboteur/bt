package kiemtrabuoi4;

import java.time.LocalDate;


public class giaodichnha extends giaodich{
    String diachi, loainha;
    giaodichnha(){

    }
    public giaodichnha(String magiaodich, LocalDate ngaygiaodich, double dongia, double dientich, String diachi, String loainha) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.diachi=diachi;
        this.loainha=loainha;
    }

    double thanhtien(){
        double thanhtien = 0.0;
        if(this.loainha.equals("cao cap")){
            thanhtien = this.dientich*this.dongia;
        }else if(this.loainha.equals("thuong")){
            thanhtien = this.dientich*this.dongia*0.9;
        }
        return thanhtien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {

            if(loainha.equals("cao cap")||loainha.equals("thuong")){
                this.loainha = loainha;
            }else{
                System.out.println("chi duoc nhap:[cao cap||thuong]");
            }
       
    }

    @Override
    public String toString() {
        return String.format("%-12s|%-25s|%-12s|%-13s|%-13s|%-13s",this.magiaodich,this.ngaygiaodich,this.thanhtien(),this.loainha,this.diachi,this.dientich);
    }
}
