
//HEADER
//Program Name: Simple Sheets
//Author: Andrew Lutz
//Class: CS161 Winter 2020
//Date: 3/19/2020
//Description: A prototype program for Simple Sheets

//Package
package main.java;

//Imports
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.*;
import main.java.classes.*;

public class Main{
    public static void main(String[] args) throws ParseException {


        //Product List
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1, "Hammermill", 31.99, 100, 30));
        products.add(new Product(2, "Domtar", 59.29, 50, 20));
        products.add(new Product(3, "TruRed", 59.99, 40, 30));


        //Employee Mailing Addresses
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address(1, "123 Main", " ", "Portland", "OR", 97030));
        addresses.add(new Address(2, "456 Third", " ", "The Dalles", "OR", 97058));
        addresses.add(new Address(3, "789 Fourth", " ", "Hood River", "OR", 97031));

        
        addresses.add(new Address(4, "123 Fifth", " ", "Portland", "OR", 97030));
        addresses.add(new Address(5, "456 Sixth", " ", "The Dalles", "OR", 97058));
        addresses.add(new Address(6, "789 Seventh", " ", "Hood River", "OR", 97031));

       
        addresses.add(new Address(7, "123 Eighth", " ", "Portland", "OR", 97030));
        addresses.add(new Address(8, "456 Ninth", " ", "The Dalles", "OR", 97058));
        addresses.add(new Address(9, "789 Tenth", " ", "Hood River", "OR", 97031));

        addresses.add(new Address(10, "123 Pool", " ", "Portland", "OR", 97030));
        addresses.add(new Address(11, "456 Rock", " ", "The Dalles", "OR", 97058));
        addresses.add(new Address(12, "789 River", " ", "Hood River", "OR", 97031));
          
        //Two new Customers
        Customer customerOne = new Customer(1, "John" , "Smith", "5415553369", "JS@gmail.com",
                                            addresses.get(0), addresses.get(1), addresses.get(2));
        
        Customer customerTwo = new Customer(1, "Jane" , "Doe", "541456789", "JD@gmail.com",
                                            addresses.get(3), addresses.get(4), addresses.get(5));

            
       
        // New Employees
        Employee eOne = new Employee(1, "Bob", "Jones", "5414562563", "BJ@SS.com",
                                     addresses.get(6),  "01/15/2019", 10000, "Sales", .15);
            
        

        Employee eTwo = new Employee(2, "Mary", "Ford", "5419932247", "MF@SS.com",
                                     addresses.get(7),  "05/02/2015", 10000, "Sales", .15);
            
                    
                
            
             List<LineItem> paper = new ArrayList<LineItem>();
            paper.add(new LineItem(15, products.get(0)));
            paper.add(new LineItem(9, products.get(1)));
            paper.add(new LineItem(8, products.get(2)));
            

         Order one = new Order(new Date(), 123, customerOne, eOne, "Sales", paper, eOne.getCommission());
                                      
                   System.out.println(one.printOrder());

                             
                 
    }
} 

/* 
Footer
Order Date: Thu Mar 19 16:32:47 PDT 2020
Order Number: 123
Sales Associate: 1

Customer: John Smith
Billing Address: 456 Third
The Dalles OR, 97058

Shipping Address: 789 Fourth
Hood River OR, 97031

Status: Sales

Products Ordered:
Ammount: 15
Product: Hammermill
Sub Total: 479.84999999999997

Ammount: 9
Product: Domtar
Sub Total: 533.61

Ammount: 8
Product: TruRed
Sub Total: 479.92

Order Total: 1493.38
Commission: 224.007
Updated Product Totals :null
 */
