package assessment;
import java.util.Map;

public class ThreeforTwoRule implements Rule {
	private int numOfItems;
	private double originalPrice;

	public ThreeforTwoRule(){
		this.numOfItems  = 0;
		this.originalPrice = 0.0;
	}
	
	@Override
	public OrderList apply(String[] skuList, OrderList orderlist) {
		// TODO Auto-generated method stub
		
		for (String sku : skuList){
			if( sku.equals("atv")){
				numOfItems++;
				this.originalPrice = orderlist.getPrice(sku);
			}
		}
		if(numOfItems == 3){
			orderlist.removeItem("atv");
			orderlist.setPrice("atv", originalPrice*(numOfItems-1));
		}else{
			orderlist.setPrice("atv",originalPrice*(numOfItems));
		}
		return orderlist;
	}

}
