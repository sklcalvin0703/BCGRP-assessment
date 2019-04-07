package assessment;

public interface Rule {
	public OrderList apply(String[] skuList, OrderList orderlist);
}
