package assessment;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class OrderList {
	Map<String, Double> OrderList;
	
	public OrderList(){
		OrderList = new HashMap<String, Double>();
	}
	
	public void addItem(Item item){
		OrderList.put(item.getSku(), item.getPrice());
	}
	public double getPrice(String sku){
		return OrderList.get(sku);
	}
	
	public void removeItem(String sku){
		OrderList.remove(OrderList.get(sku));
	}
	
	public void setPrice(String sku, Double discountedPrice){
		OrderList.put(sku,discountedPrice);
	}
	
	public Map<String,Double> getOrderList(){
		return this.OrderList;
	}

}