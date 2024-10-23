package EX1;

public class Pepeniere {
	private Plante[]inventaire ;
	private static int Max_Plantes=1000; 
	private int nombreDePlantes ;
	
	Pepeniere () {
		this.inventaire=new Plante[Max_Plantes];
		this.nombreDePlantes = 0;
	}
	
	public void ajoutPlante(Plante P) {
		if (nombreDePlantes<Max_Plantes) {
			inventaire[nombreDePlantes]=P ;
			nombreDePlantes++;
		}
		else { System.out.println("Inventaire est pleinne..!");}
		
	}
	public void afficherInventaire() {
		for (int i = 0; i < nombreDePlantes; i++) {
   		 System.out.println("Plante #"+(i+1));
            inventaire[i].description();
            inventaire[i].fleurir();
        }
	}
	   public int compterArbresCaduques() {
	        int count = 0;
	        for (int i = 0; i < nombreDePlantes; i++) {
	            if ("Caduques".equals(inventaire[i].nom)) {
	                count++;
	            }
	        }
	        return count;
	    }
	   public double  totalAbsorptionTotaleCO2() {
		   double totale =0;
		   for(int i = 0; i<nombreDePlantes;i++) {
			   totale+= inventaire[i].absorptionCO2();
		   }
		   return totale;
	   }

	
	}
	


