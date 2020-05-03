package be.intecbrussel.the_notebook.plant_entities;

public class Tree extends Plant {

	private LeafType leaftype;

	public Tree(String name) {
		super(name);
	}

	public Tree(String name, double height) {
		super(name, height);

	}

	public LeafType getLeaftype() {
		return leaftype;
	}

	public void setLeaftype(LeafType leaftype) {
		this.leaftype = LeafType.NEEDLE;
	}

	@Override
	public String toString() {
		return   super.getName() + "[Tree type,  " + ", Height" + " " + super.getHeight() + " " + "meters" +
	", leaftype"+ " " + leaftype + "]";
	}

}
