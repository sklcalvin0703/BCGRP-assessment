package assessment;

public class Item {
	private String sku;
	private String name;
	private Double price;
	
	public Item(){
		this.sku = null;
		this.name = null;
		this.price = 0.0;
	}
	
	public Item(String sku, String name, Double price){
		this.sku = sku;
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getSku(){
		return this.sku;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPrice(Double newPrice){
		this.price = newPrice;
	}
}
