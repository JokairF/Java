package Ville;

public class Adresse {
	private String rue;
	private String ville;
	private int codepostal;
	
	
	
	public Adresse(String rue, String ville, int codepostal) {
		super();
		this.setRue(rue);
		this.setVille(ville);
		this.setCodepostal(codepostal);
	}
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codepostal=" + codepostal + "]";
	}
	

}
