package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp2 {

	public static void main(String[] args) {
		ForestNotebook notebook = new ForestNotebook();
		Herbivore sheep = new Herbivore("Sheep" , 20.50, 1.50, 2.00);
		
		notebook.addAnimal(sheep);
		
		Herbivore goat  = new Herbivore ("Goat" , 15.50, 1.25, 1.20);
		notebook.addAnimal(goat); 
		
		Carnivore lion = new Carnivore ("Lion" , 50.00,2.50,2.00);
		notebook.addAnimal(lion); 
		
		Omnivore  bear = new Omnivore ("Bear", 85.00, 6.00, 2.00);
		notebook.addAnimal(bear); 
		Omnivore  squirell =  new Omnivore ("squirell", 2.50,0.25,0.72);
		
		notebook.addAnimal(squirell); 
		Omnivore rat = new Omnivore("rat", 0.50,0.12,0.30);
		
		Omnivore racoons = new Omnivore ("racoon", 5.86, 1.25, 1.05);
		notebook.addAnimal(racoons); 
		
		Carnivore jaguar = new Carnivore ("Jaguar" , 40.50,2.50,2.25);
		notebook.addAnimal(jaguar); 
		
		notebook.getHerbivores(); // list of Herbivores without their diet.
		System.out.println("_______________________________________________________________________");
		notebook.geCarnivores(); // list of Carnivores without diet.
		System.out.println("_______________________________________________________________________");
		notebook.getOmnivores();  // list of Omnivores without diet.
		

	}

}
