package myHashTable;
import java.util.Hashtable;

// Important stuff here
public class MyHashTable {

	public static void main(String[] args) {
		Hashtable<String,Pizza> myPizza = new Hashtable<String,Pizza>();
		
		//Add a pizza to the hash table
		myPizza.put("Nicholson", new Pizza("Thin",17)); //The key is the customer name
		//Add 3 more
		myPizza.put("Meckstroth", new Pizza("Traditional",12));
		myPizza.put("Smith", new Pizza("Thin",8));
		myPizza.put("Doe", new Pizza("Pan",22));
		//Print the number of items in the object
		System.out.println("# of tems in the object = " + myPizza.size());
		
		// I would like to know what pizza was ordered by "Smith"
		Pizza smithPizza = myPizza.get("Smith");
		
	}

}
