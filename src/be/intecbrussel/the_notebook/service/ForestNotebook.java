package be.intecbrussel.the_notebook.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;

public class ForestNotebook {

	private List<Carnivore> carnivores = new ArrayList<>();
	private List<Omnivore> omnivores = new ArrayList<>();
	private List<Herbivore> herbivores = new ArrayList<>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new ArrayList<>();
	private List<Plant> plants = new ArrayList<>();

	public ForestNotebook() {

	}

	public List<Carnivore> geCarnivores() {
		carnivores.stream().forEach(System.out::println);

		return carnivores;

	}

	public void setCarnivores(List<Carnivore> carnivores) {

		this.carnivores = carnivores;

	}

	public List<Omnivore> getOmnivores() {
		omnivores.stream().forEach(System.out::println);

		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {

		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {

		herbivores.stream().forEach(System.out::println);

		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {

		this.herbivores = herbivores;
	}

	public int getPlantCount() {

		plantCount = Math.toIntExact(plants.stream().count());
		System.out.println("The toal number of plants are :" + " " + plantCount);

		return plantCount;

	}

	public int getAnimalCount() {
		animalCount = Math.toIntExact(animals.stream().count());
		System.out.println("The toal number of plants are :" + " " + animalCount);

		return animalCount;

	}

	public void addAnimal(Animal animal) {
		
		
	boolean	isDuplicate = animals.removeIf(f -> f.getName()
			                     .equalsIgnoreCase(animal.getName()));

		if (!isDuplicate && animal != null) {
				
		if (animal instanceof Carnivore) {
				carnivores.add((Carnivore) animal);
		} else if (animal instanceof Herbivore) {
				herbivores.add((Herbivore) animal);

		} else if (animal instanceof Omnivore) {
				omnivores.add((Omnivore) animal);
		} 
		animals.add(animal);

		}else {
			System.out.println("Animal already exist");
		}
		
	 }
	public void addPlant(Plant plant) {

		boolean isDuplicate = plants.stream().anyMatch(f -> f.getName()
				                     .equalsIgnoreCase(plant.getName()));

		if (!isDuplicate) {

			plants.add(plant);

		} else {
			System.out.println("Duplicate entry");
		}
	}

	public void printNotebook() {

		plants.stream().forEach(System.out::println);
		animals.stream().forEach(System.out::println);

	}

	public void sortAnimalsByName() {
		List<Animal> newlist = animals.stream()
				.sorted(Comparator
				.comparing(Animal::getName))
				.collect(Collectors.toList());
		
		newlist.forEach(System.out::println);
		
	}

	public void sortPlantsbyName() {
		List<Plant> newList = plants.stream()
				.sorted(Comparator.comparing(Plant::getName))
				.collect(Collectors.toList());
		
		    newList.forEach(System.out::println);
	}

	public void sortAnimalByHeight() {
		List<Animal> newlist = animals.stream()
				.sorted(Comparator
				.comparing(Animal::getHeight))
				.collect(Collectors.toList());
		
		newlist.forEach(System.out::println);
		

	}

	public void sortPlantsByHeight() {
		List<Plant> newList = plants.stream()
				.sorted(Comparator.comparing(Plant::getName))
				.collect(Collectors.toList());
		
		    newList.forEach(System.out::println);
	}

}
