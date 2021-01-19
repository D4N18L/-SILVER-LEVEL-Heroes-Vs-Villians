public class Proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperHeroes h = new SuperHeroes("Spiderman");
		h.run();
		h.fight();
		h.displayAbilities();
		
		
		//BAD GUY
		SuperVillians v = new SuperVillians("Thanos");
		v.run();
		v.steals();
		v.kills();
		v.displayAbilities();
		
		
		//Anti-Hero
		AntiHero a  = new AntiHero("Venom");
		a.yolo();
		a.undecided();
		a.run();
		a.kills();
		a.displayAbilities();
		
		
		//Fantastic-Four
		FantasticFour f = new FantasticFour("Human Torch");
		f.run();
		f.fight();
		f.displayAbilities();
		
		
		//Legions of Doom
		LegionsofDoom l = new LegionsofDoom("Victoe Van Doom");
		l.kills();
		l.steals();
		l.displayAbilities();
	}

}
