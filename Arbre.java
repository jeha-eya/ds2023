package EX1;

public class Arbre extends Plante {
	private String type_Feuillage;
	private  int AbsorMoyenne = 22;

	public Arbre(String nom, int hauteur, int age, double prix, String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage=type_Feuillage;
	}
	
	public void description() {
        super.description();
        System.out.println("Couleur: " + type_Feuillage);
    }
	public double absorptionCO2() {
		if (hauteur >50) {
			return AbsorMoyenne +3;
		}
		else
			return AbsorMoyenne;
	}
	



}
