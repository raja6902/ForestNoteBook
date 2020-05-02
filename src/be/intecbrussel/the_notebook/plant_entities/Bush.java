package be.intecbrussel.the_notebook.plant_entities;

public class Bush extends Plant {
	private String fruit;
	private LeafType leaftype;

	public Bush(String name) {
		super(name);

	}

	public Bush(String name, double height) {

		super(name, height);

	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {

		this.fruit = fruit;

	}

	public LeafType getLeafType() {

		return LeafType.HEART;

	}

	public void setLeafType(LeafType leaftype) {

		this.leaftype = leaftype;
	}

	@Override
	public String toString() {
		return "Bush [fruit=" + fruit + ", leaftype=" + leaftype + ", name=" + super.getName() + ", height="
				+ super.getHeight() + "]";
	}

}
