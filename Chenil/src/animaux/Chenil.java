package animaux;
import java.util.ArrayList;

public class Chenil {
	public static final int NBRMAXCHAT = 5;
	public static final int NBRMAXCHIEN = 3;
	private int nbrchat, nbrchien;
	
	private ArrayList<Animal> animaux;
	
	public Chenil()
	{
		animaux = new ArrayList<Animal>();
		this.nbrchat=0;
		this.nbrchien=0;
	}
	
	public void ajouter(Animal ani)
	{
		if (ani instanceof Chien) this.nbrchien++;
		if (ani instanceof Chat) this.nbrchat++;
		
		if (nbrchien <= NBRMAXCHIEN && nbrchat <= NBRMAXCHAT)
			animaux.add(ani);
		else
		{
			if (nbrchien > NBRMAXCHIEN)
			{
				System.out.println("On ne peut plus accueillir de chien dsl !");
			}
			if (nbrchat > NBRMAXCHAT)
			{
				System.out.println("On ne peut plus accueillir de chien dsl !");
			}
		}	
	}
	
	public boolean retirer(Animal ani)
	{
		if (animaux.indexOf(ani)>=0)
		{
			animaux.remove(animaux.indexOf(ani));
			if (ani instanceof Chien) this.nbrchien--;
			if (ani instanceof Chat) this.nbrchat--;
			return true;
		}
		else
			return false;
	}
	
	public void afficher()
	{
		for (Animal ani : animaux)
		{
			ani.affiche();
		}
	}
	
	public int nbrChat()
	{
		return this.nbrchat;
	}
	
	public int nbrChien()
	{
		return this.nbrchien;
	}
	
	public int combien()
	{
		return animaux.size();
	}

}
