package bar;

public class Boissons {
	public static void main(String[] args) {
		Boisson jus = new Boisson ("Jus d'orange", 3.f);
		String message = jus.getNom();
		javax.swing.JOptionPane.showMessageDialog(null, message);
		BoissonAlcool porto;
		porto = new BoissonAlcool("Porto", 9.5f, 18);
		message = ""+porto.getDegreAlcool();
		javax.swing.JOptionPane.showMessageDialog(null, message);
	}
}