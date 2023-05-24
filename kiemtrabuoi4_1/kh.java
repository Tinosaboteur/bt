package kiemtrabuoi4_1;

import java.time.LocalDate;

public class kh {
    public kh(LocalDate ngayrahoadon) {
        this.ngayrahoadon = ngayrahoadon;
    }
    @Override
    public String toString() {
        return "kh [makh=" + makh + ", hoten=" + hoten + ", ngayrahoadon=" + ngayrahoadon + ", soluong=" + soluong
                + ", dongia=" + dongia + "]";
    }
    public kh(String makh, String hoten, LocalDate ngayrahoadon, int soluong, double dongia, double dinhmuc) {
        this.makh = makh;
        this.hoten = hoten;
        this.ngayrahoadon = ngayrahoadon;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    String makh, hoten;
    LocalDate ngayrahoadon;
    int soluong;
    double dongia;
    kh(){}
    public String getMakh() {
        return makh;
    }
    public void setMakh(String makh) {
        this.makh = makh;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public LocalDate getNgayrahoadon() {
        return ngayrahoadon;
    }
    public void setNgayrahoadon(LocalDate ngayrahoadon) {
        this.ngayrahoadon = ngayrahoadon;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public double getDongia() {
        return dongia;
    }
    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    
    
}
