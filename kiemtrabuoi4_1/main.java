package kiemtrabuoi4_1;

import java.time.LocalDate;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        quanlykh ds= new quanlykh();
        int a=0;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1.Nhap thong tin khach hang viet nam");
            System.out.println("2.Nhap thong tin khach hang nuoc ngoai");
            System.out.println("3.Tong so hoa don khach viet nam");
            System.out.println("4.Tong so hoa don khach nuoc ngoai");
            System.out.println("5.Trung binh thanh tien cua khach hang nuoc ngoai");
            System.out.println("6.Xuat cac thong tin hoa don khach hang viet nam");
            System.out.println("7.Xuat cac thong tin hoa don khach hang nuoc ngoai");
            System.out.println("8.Thoat");
            System.out.println("CHON: \b");
            a=input.nextInt();
            switch(a){
                case 1:{
                    khvietnam hoadoKhvietnam=new khvietnam();
                    System.out.println("Nhap vao ma khach hang:");
                    input.nextLine();
                    hoadoKhvietnam.setMakh(input.nextLine());
                    hoadoKhvietnam.setNgayrahoadon(LocalDate.now());
                    System.out.println("Nhap vao ho ten khach hang");
                    hoadoKhvietnam.setHoten(input.nextLine());
                    System.out.println("Nhap vao don gia:");
                    hoadoKhvietnam.setDongia(input.nextDouble());
                    System.out.println("Nhap vao doi tuong khach hang:");
                    input.nextLine();
                    hoadoKhvietnam.setDtkh(input.nextLine());
                    System.out.println("Nhap vao so luong");
                    hoadoKhvietnam.setSoluong(input.nextInt());
                    System.out.println("Nhap vao dinh muc");
                    hoadoKhvietnam.setDinhmuc(input.nextDouble());
                    ds.addkhvn(hoadoKhvietnam);
                    break;
                }
                case 2:{
                    khnuocngoai khnuocngoai = new khnuocngoai();
                    System.out.println("Nhap vao ma khach hang");
                    input.nextLine();
                    khnuocngoai.setMakh(input.nextLine());
                    khnuocngoai.setNgayrahoadon(LocalDate.now());
                    System.out.println("Nhap vao ten khach hang:");
                    khnuocngoai.setHoten(input.nextLine());
                    System.out.println("Nhap vao quoc tich:");
                    khnuocngoai.setQuoctich(input.nextLine());
                    System.out.println("Nhap vao so luong:");
                    khnuocngoai.setSoluong(input.nextInt());
                    System.out.println("Nhap vao don gia:");
                    khnuocngoai.setDongia(input.nextDouble());
                    ds.addkhnn(khnuocngoai);
                    break;
                }
                case 3:{
                    ds.tongkhvietnam();
                    break;
                }
                case 4:{
                    ds.tongkhnuocngoai();
                    break;
                }
                case 5:{
                    ds.tbtienkhnuocngoai();;
                    break;
                }
                case 6:{
                    ds.xuathoadonvietnam();
                    break;
                }
                case 7:{
                    ds.xuathoadonnuocngoai();
                    break;
                }
            }
        }while(a!=8);
    }
}
