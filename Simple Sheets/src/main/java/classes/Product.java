//Package Name
package main.java.classes;

public class Product{

    //Members
    private int productID;
    private String name;
    private double price;
    private int quantityOH;
    
    //Member functions
    public Product(int productID, String name, double price, int quantityOH, double total) {
        this.name = name;
        this.price = price;
        this.quantityOH = quantityOH;
        this.productID = productID;
        //updateQuantOnHand(quantityOH);
        
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOH() {
        return quantityOH;
    }

    public void setQuantityOH(int quantityOH) {
        this.quantityOH = quantityOH;
    }
    
    //Method Updates quantity on hand
    public void updateQuantityOH(int i){
    setQuantityOH(getQuantityOH() - i);
    }

    //Add to Quantity On Hand
    public void addQuantity(int q){
        setQuantityOH(getQuantityOH() + q);
    }    
    
}
