package assessment;
import java.util.Map;
import java.util.HashMap;

public class ItemMap {
	Map<String, Item> ItemMap;
	
	public ItemMap(){
		ItemMap = new HashMap<String, Item>();
	}
	
	public void addItem(Item item){
		ItemMap.put(item.getSku(), item);
	}
	public Item getItem(String sku){
		return ItemMap.get(sku);
	}
	
	public double getPrice(String sku){
		return ItemMap.get(sku).getPrice();
	}
	
	public String getName(String sku){
		return ItemMap.get(sku).getName();
	}
	
	public boolean isExist(String sku){
		if(ItemMap.get(sku) != null){
			return true;
		}else{
			return false;
		}
	}
}
