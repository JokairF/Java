package animaux;
public class Chat extends Animal {

	public Chat(String nom)
	{
		super(nom);
	}
	
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(" et je suis un chat");
	}

}
