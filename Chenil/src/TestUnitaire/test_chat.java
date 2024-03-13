package TestUnitaire;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import animaux.Chat;

class test_chat {


	@Test
	void testChat() {
		Chat chat = new Chat("Paul");
		assertEquals("Erreur", chat.getNom(), "Paul");
	}
}
