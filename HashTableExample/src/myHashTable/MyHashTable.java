package myHashTable;
import java.util.Hashtable;
import java.util.Set;

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
		if (smithPizza == null) {
			System.out.println("Lookup failed.");
		} else {
			System.out.println(smithPizza.getDough()); // The dough in the Pizza ordered by "Smith"
		}
		long key = 0;
		/*while(true){
			//This will run forever because we will be overwriting the same pizza over and over
			//myPizza.put("Huston",new Pizza("thin",20));
			myPizza.put(String.valueOf(key),new Pizza("thin",20));
			key++;
			if (key % 1000000 ==0) {System.out.println(myPizza.size());}
		}*/
		// How do I iterate over a hastable?
		Set<String> keys = myPizza.keySet();
		for (String k: keys) {
			System.out.println("Value of "+ k+ " is: "+ myPizza.get(k).getDough());
			//How do hashtables sort?
			System.out.println(myPizza.get(k).hashCode() % myPizza.size());
		}
		
	}

}
