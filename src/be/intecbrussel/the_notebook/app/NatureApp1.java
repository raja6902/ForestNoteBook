package be.intecbrussel.the_notebook.app;

import java.util.HashSet;
import java.util.List;
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

public class NatureApp1 {

	public static void main(String[] args) {
		
		ForestNotebook notebook = new ForestNotebook();
		
		Bush blackthorn = new Bush("Blackthorn", 6.50);
		blackthorn.setLeafType(LeafType.NEEDLE);
		
		Bush hedge = new Bush("Shrub", 6.75);
		hedge.setLeafType(LeafType.ROUND);
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
		
		Carnivore lion = new Carnivore ("Lion" , 50.00,6.00,2.00);
		notebook.addAnimal(lion); lion.setMaxFoodSize(10.00);  // Lion is shorter than bear so eat less than bear.
		
		Omnivore  bear = new Omnivore ("Bear", 85.00, 7.50, 2.00);
		notebook.addAnimal(bear); bear.addPlantToDiet(blackthorn); bear.setMaxFoodSize(19.50); // bear maxfoodsize depends upon his height
		Omnivore  squirell =  new Omnivore ("squirell", 2.50,0.25,0.72);
		
		notebook.addAnimal(squirell); squirell.addPlantToDiet(rose); squirell.setMaxFoodSize(0.50);
		Omnivore rat = new Omnivore("rat", 0.50,0.12,0.30);
		
		Omnivore racoons = new Omnivore ("racoon", 5.86, 1.25, 1.05);
		notebook.addAnimal(racoons); racoons.addPlantToDiet(tulip); racoons.setMaxFoodSize(2.50);
		
		Carnivore jaguar = new Carnivore ("Jaguar" , 40.50,3.50,2.25);
		notebook.addAnimal(jaguar); jaguar.setMaxFoodSize(9.50);
		
		Carnivore leopard = new Carnivore("Leopard", 40.25, 5.35, 2.26);
        notebook.addAnimal(leopard); leopard.setMaxFoodSize(9.45); 
	//	notebook.addAnimal(leopard); // to check if removing duplicate method workinh.
		notebook.addPlant(tulip);
		notebook.addPlant(rose);
		notebook.addPlant(indica);
		notebook.addPlant(hedge);
		notebook.addPlant(alpine);
		notebook.addPlant(blackthorn);
	//	notebook.addPlant(blackthorn);      // to check if removing duplicate method working.
		
		notebook.printNotebook();   // printing un-sorted  list
		
		
		

	}

}
