package main.java.classes;

public class LineItem{

    //Members
    private int quantity;
    private Product product;
    private double cost;
    
    //Member Functions
    public LineItem(int quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
        calcSubTotal();  
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public void calcSubTotal() {
       setCost(getProduct().getPrice() * getQuantity());
    }
   
    
}