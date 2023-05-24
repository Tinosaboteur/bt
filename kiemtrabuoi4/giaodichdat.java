package kiemtrabuoi4;

import java.time.LocalDate;

public class giaodichdat extends giaodich{
    String loaidat;
    giaodichdat(){

    }
    public giaodichdat(String magiaodich, LocalDate ngaygiaodich, double dongia, double dientich, String loaidat) {
        super(magiaodich, ngaygiaodich, dongia, dientich);
        this.loaidat=loaidat;
    }

    double thanhtien(){
        double thanhtien=0.0;
        if(this.loaidat.equals("C")||this.loaidat.equals("B")){
            thanhtien = this.dientich*this.dongia;
        }else if(this.loaidat.equals("A")){
            thanhtien = this.dientich*this.dongia*1.5;
        }    
        return thanhtien;  
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        if(loaidat.equals("A")||loaidat.equals("B")||loaidat.equals("C")){
        this.loaidat = loaidat;
    }else{
        System.out.println("chi duoc nhap:[A,B,C]");
    } 
    }

    
    @Override
    public String toString() {
        return String.format("%-12s|%-25s|%-12s|%-13s|%-13s",this.magiaodich,ngaygiaodich,this.thanhtien(),this.loaidat,this.dientich);
    }
    

}