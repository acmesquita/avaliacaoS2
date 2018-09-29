package teste;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import respostas.questao9.BinaryTree;

public class TesteQuestao9 {

	@Test
	public void testeSomaDosValores() {

		BinaryTree secondLeft = new BinaryTree(15);
		BinaryTree secondeRight = new BinaryTree(-5);
		BinaryTree firstLeft = new BinaryTree(secondLeft, secondeRight);
		BinaryTree firstRight = new BinaryTree(5);
		
		int resultado = new BinaryTree(firstLeft, firstRight).sum();
		
		Assert.assertEquals(15, resultado);
	}
}
