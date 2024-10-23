package EX1;

public class Plante {
	protected String nom;
	protected int hauteur;
	protected int age;
	protected double prix;
	
	public Plante(String nom, int hauteur , int age,double prix) {
	    this.nom = nom;
	    this.hauteur = hauteur;
	    this.age = age;
	    this.prix = prix;
	}

	

	@Override
	public String toString() {
		return "Plante [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
	}
	
	public void description() {
		System.out.println(this.toString());
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	public void fleurir() {
	}

	public double absorptionCO2() {
		return 0;
	}






	
	
	
	

}
