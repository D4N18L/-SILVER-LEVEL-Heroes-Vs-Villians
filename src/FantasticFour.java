
public class FantasticFour extends SuperHeroes {

	public FantasticFour(String name) {
		super(name);// makes the classs extended a superclass 
		// TODO Auto-generated constructor stub
		
		this.moreStrength();
		this.moreSpeed();
	}
	
	public void moreStrength() {
		this.strength += 45;
		if (this.strength > 100) {
			//stops it from going over 100
			this.strength = 100;
		}
	}
	
	public void moreSpeed() {
		this.speed += 50;
		if (this.speed > 100) {
			//stops it from going over 100
			this.speed = 100;
		}
	}

}
