package assessment;

public class DiscountRule implements Rule {
	private int numOfItems;
	private double discountedPrice;
	private double originalPrice;
	
	public DiscountRule(Double discountedPrice){
		this.numOfItems = 0;
		this.discountedPrice = discountedPrice;
		this.originalPrice = 0.0;
	}
	@Override
	public OrderList apply(String[] skuList, OrderList orderlist) {
		// TODO Auto-generated method stub
		for (String sku : skuList){
			if( sku.equals("ipd")){
				numOfItems++;
				this.originalPrice = orderlist.getPrice(sku);
			}
		}
		
		if(numOfItems >= 4){
			orderlist.setPrice("ipd", discountedPrice*numOfItems);
		}else{
			orderlist.setPrice("ipd", originalPrice*numOfItems);
		}
		
		return orderlist;
	}

}
