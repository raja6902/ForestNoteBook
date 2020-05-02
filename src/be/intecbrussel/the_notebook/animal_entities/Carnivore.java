package be.intecbrussel.the_notebook.animal_entities;

public class Carnivore extends Animal {

	private double maxFoodSize;

	public Carnivore(String name) {
		super(name);
	}

	public Carnivore(String name, double weight, double height, double length) {

		super(name, weight, height, length);

	}

	public double getMaxFoodSize() {

		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {

		double foodSize = (super.getHeight() > 120.00) ? (+1) : (-1);

		this.maxFoodSize = foodSize;
	}

	@Override
	public String toString() {
		return "Carnivore [ Name = " + " " + super.getName() + " " + " maxFoodSize=" + " " + maxFoodSize + "]";
	}

}
