package be.intecbrussel.the_notebook.animal_entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;

public class Omnivore extends Animal {

	private Set<Plant> plantDiet = new HashSet<>();
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


		this.maxFoodSize = maxFoodSize;

	}

	public void addPlantToDiet(Plant plant) {
		 plantDiet.add(plant);
	}

	@Override
	public String toString() {
	return super.getName() + "[Omnivore,"+ " "+  "weight: " + super.getWeight()+ " " +"kgs,"+ " " +  "Height:" 
	+ " "+ super.getHeight()+ " " + "meters,"+  ", MaxFoodSize: "+ " " + maxFoodSize + " "+ 
			"Plant Diet " + plantDiet;
	 
		
		
		
		
	}		
		
}