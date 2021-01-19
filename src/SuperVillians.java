//extends takes methods from the SuperHero Class
public class SuperVillians extends SuperHeroes {

	public SuperVillians(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void steals() {
		System.out.println( this.name + ": is stealing in broad daylight");
		System.out.println("");
	}
	
	public void kills() {
		System.out.print(this.name + ": is killllinnngggg!!!!");
		System.out.println("");
	}
	
}
