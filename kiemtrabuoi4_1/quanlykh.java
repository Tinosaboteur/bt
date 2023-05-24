package kiemtrabuoi4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class quanlykh {
    ArrayList<khnuocngoai> khnuocngoais = new ArrayList<>();
    ArrayList<khvietnam> khvietnams = new ArrayList<>();

    void tongkhvietnam(){
        System.out.println("tong khach hang viet nam la: "+khvietnams.size());
    }
    void tongkhnuocngoai(){
        System.out.println("tong khach hang nuoc ngoai la:"+khnuocngoais.size());
    }
    void tbtienkhnuocngoai(){
        double total =0.0;
        for(khnuocngoai obj:khnuocngoais){
            total+=obj.thanhtien();
        }
        total/=khnuocngoais.size();
        System.out.println("trung binh tien khach hang nuoc ngoai la: "+total);
    }
    void xuathoadonnuocngoai(){
        System.out.println(String.format("%-8s|%-20s|%-20s|%-12s|%-10s|%-10s|","MA KHACH HANG","HO TEN","NGAY RA HOA DON","QUOC TICH","SO LUONG","THANH TIEN\n"));
        for(khnuocngoai obj:khnuocngoais){
            System.out.println(obj);
        } 
    }
    void xuathoadonvietnam(){
        System.out.println(String.format("%-8s|%-20s|%-20s|%-12s|%-10s|%-10s|%-10s","MA KHACH HANG","HO TEN","NGAY RA HOA DON","DOI TUONG KHACH HANG","SO LUONG","DON GIA","THANH TIEN\n"));
        for(khvietnam obj:khvietnams){
            System.out.println(obj);
        } 
    }
    void addkhvn(khvietnam khvietnam){
        this.khvietnams.add(khvietnam);
    }
    void addkhnn(khnuocngoai khnuocngoai){
        this.khnuocngoais.add(khnuocngoai);
    }
}
