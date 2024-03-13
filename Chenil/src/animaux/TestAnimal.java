package animaux;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chenil monChenil = new Chenil();
		Chien rex=new Chien("rex");
		Chien albert=new Chien("Albert");
		Chat pipo=new Chat("ripo");
		Chat sushi=new Chat("Sushi");
		monChenil.ajouter(rex);
		monChenil.ajouter(pipo);
		
		if (!monChenil.retirer(albert))
		{
			System.out.println("Cet animal n'existe pas !");
		};
		monChenil.afficher();
		System.out.println("Il y a "+ monChenil.combien() +" animaux dans le chenil");
		monChenil.ajouter(sushi);
		System.out.println("Il y a "+ monChenil.combien() +" animaux dans le chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chien("ouaf"));
		System.out.println("Il y a "+ monChenil.nbrChat()+" chats dans mon chenil");
		System.out.println("Il y a "+ monChenil.nbrChat()+" chiens dans mon chenil");
		monChenil.retirer(rex);
		System.out.println("Il y a "+ monChenil.nbrChat()+" chiens dans mon chenil");
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		monChenil.ajouter(new Chat("cat"));
		System.out.println("Nombre de chat maximum pour n'importe quel Chenil est de:"+Chenil.NBRMAXCHAT);
		System.out.println("Nombre de chien maximum pour n'importe quel Chenil est de:"+Chenil.NBRMAXCHIEN);

		/*public static void main(String[] args) {
		Chenil monChenil = new Chenil();
		Chien rex=new Chien("Rex");
		Chien albert=new Chien("Rex");
		monChenil.ajouter(rex);
		monChenil.ajouter(albert);
		if (rex.equals(albert)) {
			System.out.println("C'est les mêmes !");
		}
		else
		{
			System.out.println("C'est pas les mêmes !");
		}
	}*/
		
	}
}
