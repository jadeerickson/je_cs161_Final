public class Product{

    private String name;
    private Double price;
    private int quanitiyOH;
    private Double total;
    private int productID;


    public Product(String name, double price, int quantitOH, double total, int productID){
       
   

/*     public void addItemToInv(String name){

               
        for(int i = 0; i < inv.length; i++){
                if(inv[i] == ""){
                        inv[i] = name, price, quanitiyOH, total, productId);
                       
                        System.out.println("You have added: " + name + ".");
                        return;
                }
        }
        System.out.println("You have know room in your inventory.");
}

//Prints the inventory.
public void printInv(){
        for(String x: inv){
                System.out.println(x); */
       // }
/* }

//Removes a item from your inventory.
public void removeItemFromInv(String name){
        for(int i = 0; i < inv.length; i++){
                if(inv[i].equals(name)){
                        inv[i] = "";
                }
        }
        System.out.println("That item is not in your inventory."); */
}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuanitiyOH() {
		return this.quanitiyOH;
	}

	public void setQuanitiyOH(int quanitiyOH) {
		this.quanitiyOH = quanitiyOH;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public int getProductID() {
		return this.productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

  