//Final CS 161
//Jade Erickson
//CS 161 Final 2019
//03/19/20
// A protype program to manage inventory for Simple Sheets.

package main.java.classes;

import main.java.classes.Address;
import main.java.classes.Employee;
import main.java.classes.Lineitem;
import main.java.classes.Order;
import main.java.classes.Person;
import main.java.classes.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{

    public static void main(String[] args) {

    // create employee
    Employee employee1 = new Employee(1, "Simon", "Lane", "5098662967", "Simon@gmail.com", 45000, 15, "Sales", mailingAddress);
    Employee employee2 = new Employee(2, "Hailey", "Ritz", "5416762231", "Haileyr@gmail.com", 45000, 15, "Sales", mailingAddress);
    
    // employee addresses
    List<Address> employeeAddresses = new ArrayList<Address>();
    employeeAddresses.add(new Address(1, "123 Jammin Street", "", "Nowhere", ", ", "OR", " ", 97058));
    employeeAddresses.add(new Address(2, "442 Gamer rd", "Mosier" , ", ", "OR", " " , 97058));
    employee1.setMailingAddress(employeeAddresses.get(0));
    employee2.setMailingAddress(employeeAddresses.get(0));
    employee1.gethiredate();
    employee2.gethiredate();
    
    // Customers 
    Customer customer1 = new Customer(1, "Emily"," ", "Lake"," ", "5419931024", " ", "Emilylake@gmail.com", customerBilling.get(0), customerShipping.get(0), customerMailing.get(0));
    Customer customer2 = new Customer(2, "Sam", " ", "Lively", " ", "5098526345", " ", "Samlively@gmail.com", customerBilling.get(1), customerShipping.get(0), customerMailing.get(1));
    Customer customer3 = new Customer(3, "Sally", " ", "Read", " ", "5091477532", " ", "Sallyread@hotmail.com", customerBilling.get(2), customerShipping.get(2), customerBilling.get(2));

    // customer billing
    List<Address> customerBilling = new ArrayList<Address>();
    customerBilling.add(new Address(1, "144 Palos", " ", "White Salmon", ", ", "WA", " ", 98672));
    customerBilling.add(new Address(2, "484 Jewett", ", ", "White Salmon", ", ", "WA", " ", 98672));
    customerBilling.add(new Address(3, "653 Oak", ", ", "Hood River", ", ", "OR", " ", 97032));

    // customer shipping
    List<Address> customerShipping = new ArrayList<Address>();
    customerShipping.add(new Address(1, "1800 Sandy Blv", ", ", "Portland", ", ","OR", " ", 97035));
    customerShipping.add(new Address(2, "360 Croft rd", ", ", "Portland", ", ","OR", " ", 97035));
    customerShipping.add(new Address(3, "713 Warf rd", ", ", "Portland", ", ","OR", " ", 97035));
        
    // customer mailing 
    List<Address> customerMailing = new ArrayList<Address>();
    customerShipping.add(new Address(1, "727 Glendale St", ", ", "Portland", ", ","OR", " ", 97035));
    customerShipping.add(new Address(2, "11 Wrangler rd", ", ", "Portland", ", ","OR", " ", 97035));
    customerShipping.add(new Address(3, "75 South Jefferson Rd", ", ", "Portland", ", ","OR", " ", 97035));

     // products
     Product product1 = new Product("Hammermill Paper", 31.99, 20, 1);
     Product product2 = new Product("Tru Red Paper", 59.99, 20, 2);
     Product product3 = new Product("Domtar Paper", 59.29, 20, 3);

    List<lineItem> fullorder = new ArrayList<LineItem>();
    products.add(new LineItem(10, product1));
    products.add(new LineItem(4, product2));
    products.add(new LineItem(3, product3));

    //List of orders
    orders.add(new order(1, customer1, employee1, fullorder));

    }


