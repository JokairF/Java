package geometrie;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(1.2, 2.3, 4.3);
		c1.getC().affiche();
		c1.affiche();
		c1.getC().deplace(1.2,2);
		c1.getC().affiche();
		c1.affiche();

	}
}
