package kiemtrabuoi4_1;

import java.time.LocalDate;

public class khvietnam extends kh{
    public khvietnam(LocalDate ngayrahoadon) {
        super(ngayrahoadon);
    }
    khvietnam(){}
    String dtkh;
    double dinhmuc;
    public khvietnam(String makh, String hoten, LocalDate ngayrahoadon, int soluong, double dongia, double dinhmuc,
            String dtkh, double dinhmuc2) {
        super(makh, hoten, ngayrahoadon, soluong, dongia, dinhmuc);
        this.dtkh = dtkh;
        dinhmuc = dinhmuc2;
    }
    public khvietnam(String dtkh, double dinhmuc) {
        this.dtkh = dtkh;
        this.dinhmuc = dinhmuc;
    }
    public String getDtkh() {
        return dtkh;
    }
    public void setDtkh(String dtkh) {
        this.dtkh = dtkh;
    }
    public double getDinhmuc() {
        return dinhmuc;
    }
    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    double thanhtien(){
        double thanhtien=0.0;
        if(this.soluong<=this.dinhmuc){
            thanhtien = this.soluong*this.dongia;
        }else{
            thanhtien = this.soluong*this.dongia*this.dinhmuc+(this.soluong-this.dinhmuc)*this.dongia*2.5;
        }
        return thanhtien;
    }

    @Override
    public String toString() {
        return String.format("%-13s|%-20s|%-20s|%-12s|%-10s|%-10s|%-10s",this.makh,this.hoten,this.ngayrahoadon,this.dtkh,this.soluong,this.dongia,this.thanhtien());
    }

}
