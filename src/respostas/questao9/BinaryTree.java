package respostas.questao9;

public class BinaryTree {

	int valor;
	
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(BinaryTree left, BinaryTree right) {
		super();
		this.valor = 0;
		this.left = left;
		this.right = right;
	}

	public BinaryTree(int valor) {
		this.valor = valor;
	}

	public int sum() {
		int valorLeft = left != null ? left.sum() : 0;
		int valorRight = right!= null ? right.sum() : 0;
		valor += valorLeft + valorRight;
		return valor;
	}
}
