package myHashTable;

/**
 * A topping on a pizza
 * @author meckstss
 *citations: https://scotch.io/bar-talk/s-o-l-i-d-the-first-five-principles-of-object-oriented-design
 */
public class Topping {
	private String name;
	//Where should it be on the pizza? Three possibilities: all, left side, right side
	
	public enum where_enum {all, side1, side2, onTheSide};
	private where_enum where;	// Property that is of "where_enum" type
	
	// Ratio
	private double ratio;	// How of the pizza is covered with this topping
	
	// Should we be able to instantiate a topping object with no name/where/ratio ?
	public Topping(String name, where_enum where, double ratio){
		setName(name);
		setWhere(where);
		setRatio(ratio);
	}
	/**
	 * A "copy constructor" because it accepts as an argument an instance of itself
	 * @param t A copy of the Topping object being passed
	 */
	public Topping(Topping t){
		this.setName(t.getName());
		this.setRatio(t.getRatio());
		this.setWhere(t.where);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public where_enum getWhere() {
		return where;
	}

	public void setWhere(where_enum where) {
		this.where = where;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public String toString(){
		return name;
	}

}
