package be.intecbrussel.the_notebook.plant_entities;

public class Flower extends Plant {

	private Scent smell;

	public Flower(String name) {
		super(name);
	}

	public Flower(String name, double height) {
		super(name, height);

	}

	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return super.getName() + " "  + "[Flower type, "  + " " + "Height " + " " + super.getHeight()
		+" "+ " meters" +  " "+",scent "+ " " + smell + "]";
	}

}
