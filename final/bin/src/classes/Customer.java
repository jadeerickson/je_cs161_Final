public class Customer extends Person{

    private Address billingAddress;
    private Address shippingAddress;

         
    public setCustomerinformation(String firstName, String lastName, int id, String phoneNumber, String email, Address billingAddress, Address shippingAddress, Address mailingAddress){

        setfirstName(firstName);
        setlastName(lastName);
        setid(id);
        setphoneNumber(phoneNumber);
        setemail(email);
        setbillingAddress(billing);
        setShippingAddress(shippingAddress);
        setmailingAddress(shipping);
        
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

}