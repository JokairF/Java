package bar;

public class BoissonAlcool extends Boisson {
	private int degreAlcool;
	
	public BoissonAlcool(String nom, float prix, int degreAlcool)
	{
		super (nom, prix);
		this.degreAlcool = degreAlcool;
	}
	
	public int getDegreAlcool()
	{
		return this.degreAlcool;
	}	
}