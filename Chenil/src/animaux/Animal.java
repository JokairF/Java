package animaux;

public abstract class Animal {
	protected String nom;
	
	public Animal(String nom) 
	{
		this.nom=nom;
	}
	
	public void affiche() {
		System.out.print(this.nom);
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		if (this.nom != null)
			return this.nom.hashCode();
		
		else
			return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this.nom != null)
		{
			if (obj instanceof Animal)
			{
				Animal animal = (Animal)obj;
				return this.nom.equals(animal.nom);
			}
		}
		return false;
	}
}
