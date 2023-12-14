package Ville;

public class TestPersonne {

	public static void main(String[] args) {
		Adresse a1 = new Adresse ("Tomb Raider", "Paris", 77500);
		Personne p1 = new Personne("Croft", "Lara", a1);
		System.out.println(p1);	

	}

}
