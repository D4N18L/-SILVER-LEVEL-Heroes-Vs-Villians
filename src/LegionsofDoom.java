
public class LegionsofDoom extends SuperVillians {

	public LegionsofDoom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		moreHatred();
	}

	
	public void moreHatred() {
		this.health+= 35;
		if (this.health > 100) {
			this.health = 100;
		}
	}
}
