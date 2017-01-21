package application;

public class jeu {
	
	public static void main(String[] args) {
		int gametype=0;
		if (gametype == 0)
		{
			System.out.println("Jeu en cours d'Initialisation ... ");
			//initialisation d'un jeu normal avec :
			/*18 cartes Attaque
					3 × Accident
					3 × Panne d'essence
					3 × Crevé
					4 × Limite de vitesse
					5 × Feu rouge
										38 cartes Parade
												6 × Réparations
												6 × Essence
												6 × Roue de secours
												6 × Fin de limite de vitesse
												14 × Feu vert
			4 cartes Botte
					1 × As du volant
					1 × Citerne
					1 × Increvable
					1 × Prioritaire
										46 cartes Distance
												10 × 25 km
												10 × 50 km
												10 × 75 km
												12 × 100 km
												4 × 200 km
					*/
			Distance km25 = new Distance(25, 10);
			Distance km50 = new Distance(50, 10);
			Distance km75 = new Distance(75, 10);
			Distance km100 = new Distance(100, 12);
			Distance km200 = new Distance(200, 4);
			
			Attaque Accident = new Attaque("Accident", 3);
			Attaque PanneEssence = new Attaque("PanneEssence", 3);
			Attaque Creve = new Attaque("Creve", 3);
			Attaque LimiteVitesse = new Attaque("LimiteVitesse", 4);
			Attaque FeuRouge = new Attaque("FeuRouge", 5);
			
			Parade Reparations = new Parade("Reparations", 6) ;
			Parade Essence = new Parade("Essence", 6) ;
			Parade RoueSecours = new Parade("RoueSecours", 6) ;
			Parade FinLimiteVitesse = new Parade("FinLimiteVitesse", 6) ;
			Parade FeuVert = new Parade("FeuVert", 164) ;
			
			Botte AsVolant = new Botte("AsVolant", 1);
			Botte Citerne = new Botte("Citerne", 1);
			Botte Increvable = new Botte("Increvable", 1);
			Botte Prioritaire = new Botte("Prioritaire",1);
			System.out.println("Initialisation du jeu terminée ... ");
		}
	}

}
