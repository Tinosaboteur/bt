package lab3thonl;

public class orderdetail extends product{
    public int quatity;
    public product product;
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
        return (this.getQuatity()*this.product.getPrice());
    }
 @Override
 public String toString() {
     return String.format("%-10s|%-15s|%-12s|%-13s|%-13s",this.product.getProductID(),this.product.getDescription(),this.product.price,this.quatity,this.calcToltalPrice());
 }
    
    
}