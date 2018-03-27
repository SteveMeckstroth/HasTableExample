package myHashTable;

public class Pizza {
	private String dough;
	private int size;
	
	public Pizza(String dough, int size){
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
}
