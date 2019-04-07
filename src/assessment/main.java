package assessment;
import java.util.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item("ipd","Super iPad", 549.99);
		Item item2 = new Item("mbp","Macbook Pro", 1399.99);
		Item item3 = new Item("atv", "Apple TV", 109.5);
		Item item4 = new Item("vga","VGA adapter", 30.0);
		
		ItemMap itemmap = new ItemMap();
		itemmap.addItem(item1);
		itemmap.addItem(item2);
		itemmap.addItem(item3);
		itemmap.addItem(item4);
		
		Rule rule1 = new ThreeforTwoRule();
		Rule rule2 = new DiscountRule(499.99);
		List<Rule> rules = new ArrayList<Rule>();
		rules.add(rule1);
		rules.add(rule2);
		
		Checkout co = new Checkout(itemmap, rules);
		boolean scanResult = co.scan();
		if(scanResult){
			System.out.println("Total is: " + co.calculateTotal());
		}

	}

}
