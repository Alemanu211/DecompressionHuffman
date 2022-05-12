
public class Node {
	private int frequence;
	private String caractere;
	private Node left_child;
	private Node right_child;
	
	public Node(int frequence, String caractere, Node left_child, Node right_child) {
		this.frequence = frequence;
		this.setCaractere(caractere);
		this.setLeft_child(left_child);
		this.setRight_child(right_child);
		
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public String getCaractere() {
		return caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	public Node getLeft_child() {
		return left_child;
	}

	public void setLeft_child(Node left_child) {
		this.left_child = left_child;
	}

	public Node getRight_child() {
		return right_child;
	}

	public void setRight_child(Node right_child) {
		this.right_child = right_child;
	}
}
