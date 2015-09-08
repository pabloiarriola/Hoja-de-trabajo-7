/**
 *
 * @author Pablo Arriola
 */
public class Node {
    String key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(String key, String name) {

		this.key = key;
		this.name = name;

	}

	public String toString() {

		return name;

		/*
		 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
		 * "\nRight Child: " + rightChild + "\n";
		 */

	}
    
}
