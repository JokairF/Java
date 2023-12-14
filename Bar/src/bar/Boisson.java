package bar;

public class Boisson {
	private String nom;
	private float prix;
	
	public Boisson(String nom, float prix)
	{
		this.nom = nom;
		this.prix = prix;
	}
	
	public String getNom() 
	{
		return this.nom;
	}

	public float getPrix()
	{
		return this.prix;
	}
}
