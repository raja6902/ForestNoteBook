package be.intecbrussel.the_notebook.app;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Bush;
import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.LeafType;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Scent;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp3 {

	public static void main(String[] args) {
ForestNotebook notebook = new ForestNotebook();
		
		Bush blackthorn = new Bush("Blackthorn", 6.50);
		blackthorn.setLeafType(LeafType.NEEDLE);
		
		Bush hedge = new Bush("Shrub", 6.75);		
		Tree alpine = new Tree("Alpine" , 12.00);		
		alpine.setLeaftype(LeafType.HEART);
		
		Weed indica = new Weed("Indica", 3);
		indica.setArea(3.50);
		
		Flower rose = new Flower("Rose" , 2);
		rose.setSmell(Scent.EARTHY);
		
		Flower tulip = new Flower("Tulip" , 1.50);
		tulip.setSmell(Scent.ORANGE);
		
		// 9 different type of animals.
		Set<Plant> plantDiet = new HashSet<>();
		
		Herbivore sheep = new Herbivore("Sheep" , 20.50, 1.50, 2.00);
	
		notebook.addAnimal(sheep);sheep.addPlantToDiet(hedge); // adding plant to the diet
		
		Herbivore goat  = new Herbivore ("Goat" , 15.50, 1.25, 1.20);
		notebook.addAnimal(goat); goat.addPlantToDiet(indica);
		
		Carnivore lion = new Carnivore ("Lion" , 50.00,2.50,2.00);
		notebook.addAnimal(lion); lion.setMaxFoodSize(15.00);
		
		Omnivore  bear = new Omnivore ("Bear", 85.00, 6.00, 2.00);
		notebook.addAnimal(bear); bear.addPlantToDiet(blackthorn); bear.setMaxFoodSize(9.50); // both food and plants
		Omnivore  squirell =  new Omnivore ("squirell", 2.50,0.25,0.72);
		
		notebook.addAnimal(squirell); squirell.addPlantToDiet(rose); squirell.setMaxFoodSize(0.50);
		Omnivore rat = new Omnivore("rat", 0.50,0.12,0.30);
		
		Omnivore racoons = new Omnivore ("racoon", 5.86, 1.25, 1.05);
		notebook.addAnimal(racoons); racoons.addPlantToDiet(tulip); racoons.setMaxFoodSize(2.50);
		
		Carnivore jaguar = new Carnivore ("Jaguar" , 40.50,2.50,2.25);
		notebook.addAnimal(jaguar); jaguar.setMaxFoodSize(9.50);
		
		Carnivore leopard = new Carnivore("Leopard", 40.25, 2.35, 2.26);
        notebook.addAnimal(leopard); leopard.setMaxFoodSize(10.55); // FoodSize in Kgs
		
		notebook.addPlant(tulip);
		notebook.addPlant(rose);
		notebook.addPlant(indica);
		notebook.addPlant(hedge);
		notebook.addPlant(alpine);
		notebook.addPlant(blackthorn);
		
		notebook.sortAnimalsByName(); // sorted by name.
		
		System.out.println("___________________________________________________");
		notebook.sortPlantsbyName();
		System.out.println("______________________________________________________");
		
		notebook.printNotebook();  // Now with printnotebook the list of animals and plant are sorted
	

	}

}
