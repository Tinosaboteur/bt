package kiemtrabuoi4;

import java.util.ArrayList;

public class quanlygiaodich {
    ArrayList<giaodichdat> giaodichdats = new ArrayList<>();
    ArrayList<giaodichnha> giaodichnhas = new ArrayList<>();

    double trungbinhthanhtien(){
        double total=0.0;
        for(giaodichdat obj: giaodichdats){
            total += obj.thanhtien();
            total/=giaodichdats.size();
        }
        return total;
    }
    void xuatthongtingiaodichdat(){
        System.out.println(String.format("%-10s|%-25s|%-12s|%-13s|%-13s","MA GIAO DICH","NGAY GIAO DICH","THANH TIEN","LOAI DAT","DIEN TICH\n"));
        for(giaodichdat obj:giaodichdats){
            System.out.println(obj);
        } 
    }
    void xuatthongtingiaodichnha(){
        System.out.println(String.format("%-10s|%-25s|%-12s|%-13s|%-13s|%-13s","MA GIAO DICH","NGAY GIAO DICH","THANH TIEN","LOAI NHA","DIA CHI","DIEN TICH\n"));
        for(giaodichnha obj:giaodichnhas){
            System.out.println(obj);
        }
    }
    void addgiaodichdat(giaodichdat giaodichdat){
        this.giaodichdats.add(giaodichdat);
    }
    void addgiaodichnha(giaodichnha giaodichnha){
        this.giaodichnhas.add(giaodichnha);
    }
    int tonggiaodichdat(){
        return giaodichdats.size();
    }
    int tonggiaodichnha(){
        return giaodichnhas.size();
    }
}
