public class LineItem{

    private int quanity;
    private Product product;
    private Cost productCost;

	public int getQuanity() {
		return this.quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cost getProductCost() {
		return this.productCost;
	}

	public void setProductCost(Cost productCost) {
		this.productCost = productCost;
	}


}