package be.intecbrussel.the_notebook.app;

import java.util.HashSet;
import java.util.List;

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

public class NatureApp {

	public static void main(String[] args) {
		
		ForestNotebook notebook = new ForestNotebook();
		
		Bush blackt = new Bush("Blackthorn", 6.50);
		blackt.setLeafType(LeafType.NEEDLE);
		
		Tree alpine = new Tree("Alpine" , 12.00);		
		alpine.setLeaftype(LeafType.HEART);
		
		Weed indica = new Weed("Indica", 3);
		indica.setArea(3.50);
		
		Flower rose = new Flower("Rose" , 2);
		rose.setSmell(Scent.ERTHY);
		
		Flower tulip = new Flower("Tulip" , 1.50);
		tulip.setSmell(Scent.ORANGE);
		
		// 9 different type of animals.
		
		Herbivore sheep = new Herbivore("BlackSheep" , 20.50, 1.50, 2.00);
		sheep.
		notebook.addAnimal(sheep); sheep.setPlantDiet(plantDiet)
		Herbivore goat  = new Herbivore ("Goat" , 15.50, 1.25, 1.20);
		Carnivore lion = new Carnivore ("Lion" , 50.00,2.50,2.00);
		Omnivore  bear = new Omnivore ("Bear", 85.00, 6.00, 2.00);
		Omnivore  squirell =  new Omnivore ("squirell", 2.50,0.25,0.72);
		Omnivore rat = new Omnivore("rat", 0.50,0.12,0.30);
		Omnivore racoons = new Omnivore ("racoon", 5.86, 1.25, 1.05);
		Carnivore jaguar = new Carnivore ("Jaguar" , 40.50,2.50,2.25);
		Carnivore leopard = new Carnivore("Leopard", 40.25, 2.35, 2.26);

		
		notebook.addPlant(tulip);
		notebook.addPlant(rose);
		notebook.addPlant(indica);
		notebook.addPlant(tulip);
		notebook.addPlant(tulip);
		notebook.addPlant(blackt);
		notebook.addPlant(blackt);
		
		notebook.printNotebook();
		notebook.getHerbivores();

	}

}
