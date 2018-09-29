/**
 * 
 */
package respostas.questao9;

/**
 * @author Catharina Mesquita
 *
 */
public class Programa {

	public static void main(String[] args) {

		int resultado = new BinaryTree(new BinaryTree(new BinaryTree(15), new BinaryTree(-5)), new BinaryTree(5)).sum();
	
		System.out.println(resultado);
	}

}
