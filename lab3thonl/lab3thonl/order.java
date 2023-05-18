package lab3thonl;

import java.time.LocalDate;
import java.util.ArrayList;

public class order extends orderdetail{
    public int orderID;
    public LocalDate orderDate;
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public ArrayList<orderdetail> list;
    public ArrayList<orderdetail> lineItems;
    public int count;
  

    public order(){
        this.list=new ArrayList<>();

    }
    public order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public void addLineItem(product product, int soluong){
        this.lineItems.add(new orderdetail(soluong, product));
    }
    public double calcTotalCharge(){
        double total=0.0;
        for(orderdetail obj : list){
            total += obj.calcToltalPrice();
        }
        return total;
    }
    public int getOrderID() {
        return orderID;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public ArrayList<orderdetail> getLineItems() {
        return lineItems;
    }
    public void xuatthongtin(){
        System.out.println("MA HD:"+this.getOrderID()+"\nNGAY LAP HOA DON:"+this.getOrderDate()+"\n"+String.format("%-10s|%-15s|%-12s|%-13s|%-13s","MA SP","MO TA","DON GIA","S LUONG","THANH TIEN\n"));
    }
    public void add(orderdetail order) {
    }
    
    
}