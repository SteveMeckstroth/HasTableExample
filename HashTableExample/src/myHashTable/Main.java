package myHashTable;

public class Main {
	public static void main(String[] args) {
		Pizza myPizza = new Pizza("Thin",30);
		Topping t = new Topping("Mushrooms",Topping.where_enum.all, 100);
		myPizza.addTopping(t);
		System.out.println(myPizza.toString());
		t.setName("motor oil");
		System.out.println(myPizza.toString());
	}

}
