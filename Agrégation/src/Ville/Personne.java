package Ville;

public class Personne {
	
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	
	public Personne(String nom, String prenom, Adresse adresse) {
		super();
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAdresse(adresse);
	}
		
		
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public  Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse=adresse;
	}


	@Override
	public String toString() {
		return "Personne [nom= " + this.getNom() + ", prenom= " + this.getPrenom() + ", adresse= " + this.getAdresse() + "]";
	}
	

 
}
