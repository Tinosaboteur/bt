package lab3thonl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        ArrayList<orderdetail> ds =new ArrayList<>();
        orderdetail order = new orderdetail();
        order order2 = new order(1, LocalDate.of(2015, 9 , 10));
        do{
            System.out.println("chon chuc nang:");
            System.out.println("1:them thong tin");
            System.out.println("2:xuat thong tin");
            System.out.println("3:thoat");
            a = input.nextInt();
            switch(a){
                case 1:{  
            System.out.println("nhap vao ma san pham:");
            input.nextLine();
            String masanpham=input.nextLine();
            System.out.println("Nhap vao mo ta:");
            String mota=input.nextLine();
            System.out.println("nhap vao don gia:");
            double dongia=input.nextDouble();
            System.out.println("nhap vao so luong:");
            int soluong=input.nextInt();
            product product = new product(mota, masanpham, dongia);
            order = new orderdetail(soluong, product);
            ds.add(order);
            break;
        }
        
        case 2:{
            order2.xuatthongtin();
        break;
    }
}}while(a!=3);
}
}
