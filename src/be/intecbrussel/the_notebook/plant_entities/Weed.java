package be.intecbrussel.the_notebook.plant_entities;

public class Weed extends Plant {

	private double area;

	public Weed(String name) {
		super(name);
	}

	public Weed(String name, double height) {

		super(name, height);

	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return  super.getName() + "[Weed type, " + " Height" + " "
	                + super.getHeight() + " " + "meters " + "Area" +" "	+ area + "]";
	}

}
