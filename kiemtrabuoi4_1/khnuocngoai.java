package kiemtrabuoi4_1;

import java.time.LocalDate;

public class khnuocngoai extends kh{
    public khnuocngoai(LocalDate ngayrahoadon) {
        super(ngayrahoadon);
    }
    khnuocngoai(){}
    @Override
    public String toString() {
        return String.format("%-13s|%-20s|%-20s|%-12s|%-10s|%-10s|",this.makh,this.hoten,this.ngayrahoadon,this.quoctich,this.soluong,this.thanhtien());
    }

    public khnuocngoai(String makh, String hoten, LocalDate ngayrahoadon, int soluong, double dongia, double dinhmuc,
            String quoctich) {
        super(makh, hoten, ngayrahoadon, soluong, dongia, dinhmuc);
        this.quoctich = quoctich;
    }

    public khnuocngoai(String quoctich) {
        this.quoctich = quoctich;
    }

    String quoctich;

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    double thanhtien(){
        return this.soluong*this.dongia;
    }
}
