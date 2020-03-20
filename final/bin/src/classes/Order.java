package main.java.classes;
import java.util.Date;
import java.util.StringBuilder;

public class Order{

    private Date orderDate;
    private Interger number;
    private Empoyee id; 
    private String orderStatus;
    private Address billingAddress;
    private Address shippingAddress;
	private Double total;
	private LineItem lineItem;
	private Arraylist<Lineitem> fullOrder;
	private Customer customer;
	private Employee employee;
	private double commission;

	//Contructor 
	public Order(int number, Customer customer, Employee employee, ArrayList<Lineitem> fullOrder){
		setOrderDate(orderDate);
		setId(id);
		setcustomerInformation(customer.getcustomerinformation);
		setLineItem(lineItem);
		setOrderStatus(orderStatus);

		

	}




	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Interger getNumber() {
		return this.number;
	}

	public void setNumber(Interger number) {
		this.number = number;
	}

	public Number getCustomer() {
		return this.customer;
	}

	public void setCustomer(Number customer) {
		this.customer = customer;
	}

	public Empoyee getId() {
		return this.id;
	}

	public void setId(Empoyee id) {
		this.id = id;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Address getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	// Calculate Order total ?
	public double getTotalCost(){
		for (Lineitem fullorder: products) {
			totalcost += fullorder.getCost();
		}
		return totalcost;

	}
	// calculate order total
	public void CalcCommission(){
		setcommission(getTotalCost() *employee.getcommission);

	}
public String printorder(){
	StringBuilder sb = new StringBuilder();

	sb.append("\r\n" + "Order Date " + getOrderDate());
	sb.append("\r\n" + "Order Number " + getorderNumber());
	sb.append("\r\n" + "Customer ID " + getCustomerId());
	sb.append("\r\n" + "Customer Name " + getCustomername());
	sb.append("\r\n" + "Sales Associate " + getSalesassociate());
	sb.append("\r\n" + "Billing Address " + getBillingAddress());
	sb.append("\r\n" + "Shipping Address " + getShippingAddress());
	sb.append("\r\n" + "Current Status " + getOrderStatus());
	}
	public void printFullorder(){
		StringBuilder sb = new StringBuilder();
		for (int i= 0; 1 < fullOrder.size(); i++){
			sb.append("\r\n" + "Product " + fullOrder.getProduct().getName());
			sb.append("\r\n" + "Amount " +  fullOrder.get(0).getTotalCost());
		}
	}
}
