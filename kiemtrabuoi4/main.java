package kiemtrabuoi4;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        quanlygiaodich ds= new quanlygiaodich();
        do{
            System.out.println("-----MENU-----");
            System.out.println("1.Giao dich dat");
            System.out.println("2.Giao dich nha");
            System.out.println("3.Tong so giao dich dat");
            System.out.println("4.Tong so giao dich nha");
            System.out.println("5.Trung binh thanh tien cua giao dich dat");
            System.out.println("6.Xuat cac thong tin giao dich dat");
            System.out.println("7.Xuat cac thong tin giao dich nha");
            System.out.println("8.Thoat");
            System.out.println("CHON: \b");
            switch(input.nextInt()){
                case 1:{
                    giaodichdat giaodichdat=new giaodichdat();
                    System.out.println("Nhap vao ma giao dich:");
                    input.nextLine();
                    giaodichdat.setMagiaodich(input.nextLine());
                    giaodichdat.setNgaygiaodich(LocalDate.now());
                    System.out.println("Nhap vao don gia:");
                    giaodichdat.setDongia(input.nextDouble());
                    System.out.println("Nhap vao loai dat:");
                    input.nextLine();
                    giaodichdat.setLoaidat(input.nextLine());
                    System.out.println("Nhap vao dien tich");
                    giaodichdat.setDientich(input.nextDouble());
                    ds.addgiaodichdat(giaodichdat);
                    break;
                }
                case 2:{
                    giaodichnha giaodichnha = new giaodichnha();
                    System.out.println("Nhap vao ma giao dich");
                    input.nextLine();
                    giaodichnha.setMagiaodich(input.nextLine());
                    giaodichnha.setNgaygiaodich(LocalDate.now());
                    System.out.println("Nhap vao don gia:");
                    giaodichnha.setDongia(input.nextDouble());
                    System.out.println("Nhap vao loai nha:");
                    input.nextLine();
                    giaodichnha.setLoainha(input.nextLine());
                    System.out.println("Nhap vao dia chi:");
                    giaodichnha.setDiachi(input.nextLine());
                    System.out.println("Nhap vao dien tich");
                    giaodichnha.setDientich(input.nextDouble());
                    ds.addgiaodichnha(giaodichnha);
                    break;
                }
                case 3:{
                    System.out.println("Tong so giao dich dat la:"+ds.tonggiaodichdat());
                    break;
                }
                case 4:{
                    System.out.println("Tong so giao dich nha la:"+ds.tonggiaodichnha());
                    break;
                }
                case 5:{
                    System.out.println("Trung binh thanh tien cua giao dich dat la:"+ds.trungbinhthanhtien());
                    break;
                }
                case 6:{
                    ds.xuatthongtingiaodichdat();
                    break;
                }
                case 7:{
                    ds.xuatthongtingiaodichnha();
                    break;
                }
            }
        }while(a!=8);
        input.close();
    }
}
