package geometrie;

import java.util.ArrayList;

public class TestLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Figure> list = new ArrayList<Figure>();
	
	Cercle c1 = new Cercle (1.2, 2.3, 3.5);
	Cercle c2 = new Cercle (1.4, 2.5, 3.7);
	
	list.add(c1);
	list.add(c2);
	
	
	
	Rectangle r1 = new Rectangle (2.4, 3.7);
	Rectangle r2 = new Rectangle (2.9, 4.4);
	
	list.add(r1);
	list.add(r2);
	
	double airetotal = 0;
	for (Figure f : list) {
		airetotal += f.aire();
	}
	
	
	for(Object f : list) {
		System.out.println(f);
	}
	System.out.println(airetotal);
	}
	
}
