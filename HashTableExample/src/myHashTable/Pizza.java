package myHashTable;

import java.util.ArrayList;

public class Pizza {
	private String dough;
	private int size;
	private ArrayList<Topping> toppings; //Dynamic
	
	public Pizza(String dough, int size){
		toppings = new ArrayList<Topping>();	//Instantiate the toppings list
		setDough(dough);
		setSize(size);
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addTopping(Topping topping){
		//toppings.add(topping);
		toppings.add(new Topping(topping));  //Protects the data.  The main class no longer replaces Mushrooms with motor oil.
	}
	public String toString(){
		return toppings.toString();
	}
}
