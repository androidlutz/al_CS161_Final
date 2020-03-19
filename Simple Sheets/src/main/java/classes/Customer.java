//Package Name
package main.java.classes;

public class Customer extends Person{

    //Members
    private Address billingAddress;
    private Address shippingAddress;

    
    public Customer(int iDNumber, 
        String firstName, 
        String lastName, 
        String phoneNumber, 
        String eMail,
        Address mailingAddress, 
        Address billingAddress, 
        Address shippingAddress) {
            setiDNumber(iDNumber);
            setFirstName(firstName);
            setLastName(lastName);
            setPhoneNumber(phoneNumber);
            seteMail(eMail);
            setMailingAddress(mailingAddress);
            setBillingAddress(billingAddress);
            setShippingAddress(shippingAddress);
    }
    
    public String getCustomerName(){
        return(getFirstName() + " " + getLastName());
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
    //print method in main
    public String printCustomer(){
        StringBuilder sb = new StringBuilder();

        sb.append(getFirstName());
        if(!getLastName().equals("") && getLastName() != null)
            sb.append("\r\n");
            sb.append(getLastName());
            sb.append("\r\n");
            sb.append(getPhoneNumber());
            sb.append("\r\n");
            sb.append(geteMail());
            sb.append("\r\n");
            sb.append(getMailingAddress());
            sb.append("\r\n");
            sb.append(getBillingAddress());
            sb.append("\r\n");
            sb.append(getShippingAddress());

            return sb.toString(); 

    }

}