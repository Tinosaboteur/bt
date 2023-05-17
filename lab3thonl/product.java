package lab3thonl;

public class product {
    public String description, productID;
    public double price;
    public product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
    public product() {
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
