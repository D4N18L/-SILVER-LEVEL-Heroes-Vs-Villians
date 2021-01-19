
public class SuperHeroes extends  PowerSource {
	//PRIVATE VARIABLES---------------------------
	protected int strength;
	protected int speed;
	protected int health;
	//public boolean knowledge; (LATER)
	public String name;
	
	//Constructor----------------------------------
	public SuperHeroes(String name) {
		this.name = name;
		
		//Call the method in the constructor
		generateAbilities();
	}
	
	
	//Method that displays the generated abilities of the super heroes
	public void displayAbilities() {
		System.out.println("....................STATISTICS................");
		System.out.println("Strength is: " + this.strength);
		System.out.println("Speed is: " + this.speed);
		System.out.println("Health is: " + this.health);
		System.out.println("....................END OF STATISTICS................");
	}
	
	//GETTERS---------------------------------------
	
		public int getStrength() {
			return strength;
		}

		public int getSpeed() {
			return speed;
		}

		public int getHealth() {
			return health;
		}


	//METHODS - PRIVATE AND PUBLIC --------------------------------------------------------
		
	private void generateAbilities() { //Calculates the original figure
		this.strength = (int)(Math.random() * 100 +1);
		this.speed = (int)(Math.random() * 100 +1);
		this.health = (int)(Math.random() * 100 +1);
	}
	
	public void fight() {
		System.out.println(this.name + ": is fighting right now");
			
	}
	
	
	public void run() {
		System.out.println(this.name + ": is running right now");
		System.out.println("");
	}
	
	public void save() {
		System.out.print(this.name+ ": is saving so many people right now!!!!!!!!!!!!!!");
	}

	}//first parenthesis 
	
	
