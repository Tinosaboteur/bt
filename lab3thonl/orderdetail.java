package lab3thonl;

public class orderdetail extends product{
    public int quatity;
    public product product;
    public orderdetail(String description, String productID, double price, int quatity, lab3thonl.product product) {
        super(description, productID, price);
        this.quatity = quatity;
        this.product = product;
    }
    public orderdetail(){
        
    }
    public orderdetail(int quatity, lab3thonl.product product) {
        this.quatity = quatity;
        this.product = product;
    }
    public int getQuatity() {
        return quatity;
    }
    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
    public double calcToltalPrice(){
        return this.quatity*this.price;
    }
 @Override
 public String toString() {
     return String.format("%-8s|%-10s|%-15s|%-12s|%-13s|%f",this.getProductID(),this.getDescription(),this.quatity,this.price,this.calcToltalPrice());
 }
    
    
}
