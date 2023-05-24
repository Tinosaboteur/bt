package kiemtrabuoi4;

import java.time.LocalDate;

public class giaodich {
    
    giaodich(){

    }
    public giaodich(String magiaodich, LocalDate ngaygiaodich, double dongia, double dientich) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.dientich = dientich;
    }
    @Override
    public String toString() {
        return "giaodich [magiaodich=" + magiaodich + ", ngaygiaodich=" + ngaygiaodich + ", dongia=" + dongia
                + ", dientich=" + dientich + "]";
    }

    String magiaodich;
    LocalDate ngaygiaodich;
    double dongia, dientich;
    public String getMagiaodich() {
        return magiaodich;
    }
    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }
    public LocalDate getNgaygiaodich() {
        return ngaygiaodich;
    }
    public void setNgaygiaodich(LocalDate ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }
    public double getDongia() {
        return dongia;
    }
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public double getDientich() {
        return dientich;
    }
    public void setDientich(double dientich) {
        this.dientich = dientich;
    }
    

}
