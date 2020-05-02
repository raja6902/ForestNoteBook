package be.intecbrussel.the_notebook.animal_entities;

import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;

public class Omnivore extends Animal {

	private Set<Plant> plantDiet;
	private double maxFoodSize;

	public Omnivore(String name) {

		super(name);
	}

	public Omnivore(String name, double weight, double height, double length) {

		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {

		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {

		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {

		double foodSize = (super.getHeight() > 130.00) ? (+1) : (-1);

		this.maxFoodSize = foodSize;

	}

	public void addPlantToDiet(Plant plant) {
		Flower branches = new Flower("leaves");
		Weed grass = new Weed("grass");
		Tree bush = new Tree("bush");
		plantDiet.add(branches);
		plantDiet.add(bush);
		plantDiet.add(grass);
	}

	@Override
	public String toString() {
		return "Omnivore [plantDiet=" + plantDiet + ", maxFoodSize=" + maxFoodSize + "]";
	}

}
