//Package
package main.java.classes;

import java.util.Date;
import java.util.List;


public class Order{

    //Members
    private Date date;
    private int orderNumber;
    private Customer customer;
    private Address billingAddress;
    private Address shippingAddress;
    private Employee employee;
    private String status;
    private double orderTotal;
    private List<LineItem> lineItems;
    private double commission;
    private Product updatedQOH;
    

    //Member functions
    public Order(
            Date date,
            int orderNumber,            
            Customer customer,
            Employee employee, 
            String status,           
            List<LineItem> lineItems,
            double commission
            
        )

        {
            setDate(date);
            setOrderNumber(orderNumber);            
            setStatus(status);            
            setLineItems(lineItems);
            setEmployee(employee);
            setOrderTotal(orderTotal);
            calcTotal();
            calcCommission();
            setCustomer(customer);
            setBillingAddress(customer.getBillingAddress());
            setShippingAddress(customer.getShippingAddress());
            setUpdatedQOH(updatedQOH);
     
        
    }
    public Product getUpdatedQOH() {
        return updatedQOH;
    }

    public void setUpdatedQOH(Product updatedQOH) {
        this.updatedQOH = updatedQOH;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }    
    public Date getDate(){
        return date; 

    }
    public void setDate(Date date) {
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
       
    }
    
    //Calculates the order Total
     public void calcTotal(){
        for(LineItem lineItem : getLineItems()){
            setOrderTotal(getOrderTotal() + lineItem.getCost());
        }
     }
    //Calculates the comission from the total sale
    public void calcCommission(){
        setCommission(getOrderTotal() * employee.getCommission());
        }       

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        for(LineItem i : lineItems){
            i.getProduct().updateQuantityOH(i.getQuantity());
        
        }  
        this.lineItems = lineItems;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

   // print method in main
      public String printOrder(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\r\n" + "Order Date: " + getDate());
        sb.append("\r\n" + "Order Number: " +  getOrderNumber());
        sb.append("\r\n" + "Sales Associate: " + employee.getiDNumber()); 
        sb.append("\r\n");
        sb.append("\r\n" + "Customer: " + customer.getCustomerName());
        sb.append("\r\n" + "Billing Address: "  + getBillingAddress().printAddress());
        sb.append("\r\n");
        sb.append("\r\n" + "Shipping Address: " + getShippingAddress().printAddress());
        sb.append("\r\n");
        sb.append("\r\n" + "Status: " +  getStatus());
        sb.append("\r\n");
        sb.append("\r\n" + "Products Ordered: ");

        //Loop for Each Line Item
        for(LineItem lineItem : getLineItems()){
            sb.append("\r\n" + "Ammount: " + lineItem.getQuantity());
            sb.append("\r\n" + "Product: " + lineItem.getProduct().getName());            
            sb.append("\r\n" + "Sub Total: " + lineItem.getCost());
            sb.append("\r\n");
        }         
            sb.append("\r\n" + "Order Total: " + getOrderTotal());
            sb.append("\r\n" + "Commission: " + getCommission());
            sb.append("\r\n" + "Updated Product Totals :" + getUpdatedQOH());  
            return(sb.toString());
         
    
    }   
    
    
}