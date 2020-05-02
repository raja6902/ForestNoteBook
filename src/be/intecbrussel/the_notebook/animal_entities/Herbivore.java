package be.intecbrussel.the_notebook.animal_entities;

import java.util.Set;

import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;

public class Herbivore extends Animal {

	private Set<Plant> plantDiet;

	public Herbivore(String name) {
		super(name);
	}

	public Herbivore(String name, double weight, double height, double length) {

		super(name, weight, height, length);

	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {

		this.plantDiet = plantDiet;

	}

	public void addPlantToDiet(Plant plant) {
		 plantDiet.add(plant);

	}

	public void printDiet() {
		this.plantDiet.forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Herbivore [ name=" + " " + super.getName() + " " + ", weight=" + " " + super.getWeight() + " "
				+ ", height=" + " " + super.getHeight() + " " + ", length=" + " " + super.getLength() + " "
				+ ", plantDiet=" + " " + plantDiet + "]";
	}

}
