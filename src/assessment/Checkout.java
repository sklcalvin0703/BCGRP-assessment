package assessment;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Checkout {
	private ItemMap itemmap;
	private String[] skuList;
	private OrderList orderList;
	private List<Rule> rules;
	private Double total;
	
	public Checkout(ItemMap itemmap, List<Rule>rules){
		this.itemmap = itemmap;
		this.skuList = null;
		this.orderList = new OrderList();
		this.rules = rules;
		this.total = 0.0;
	}
	
	public String[] getSkuList(){
		return this.skuList;
	}
	
	public boolean scan(){
		System.out.print("SKU scanned: ");
		Scanner sc = new Scanner(System.in);
		String temp  = sc.nextLine();
		
		this.skuList = temp.split(",");
		//check if the item exist
		for (String sku : skuList){
			if(!itemmap.isExist(sku)){
				System.out.println("There is no item " + "'"+ sku +"'");
				this.skuList = null;
				return false;
			}else{
				this.orderList.addItem(itemmap.getItem(sku));
			}
		}
		return true; //it indicate all the item exists
	}
	public Double calculateTotal(){
		for (Rule rule : rules){
			this.orderList = rule.apply(skuList, orderList);
		}
		
		Map<String, Double> map = orderList.getOrderList();
		Double temp = 0.0;
		
		for (Double hi : map.values()){
			total += hi;
		}
		
	    
		return total;
	}
}
