
// Import the needed libraries
import org.jfugue.pattern.Pattern; 

public class Main {

	public static void main(String[] args) {
		
		// Init objects we need
		BST tree = new BST();
		
		tree.addNode(50, new Pattern("C5q | C5q | C5q | C5q"));
		tree.addNode(25, new Pattern("A5q | A5q | A5q | A5q"));
		tree.addNode(15, new Pattern("B5q | B5q | B5q | B5q"));
		tree.addNode(30, new Pattern("E5q | E5q | E5q | E5q"));
		tree.addNode(75, new Pattern("F5q | F5q | F5q | F5q"));
		tree.addNode(85, new Pattern("D5q | D5q | D5q | D5q"));
		
		System.out.println("---In Order---");
		tree.inOrderTraverseTree(tree.root);
		System.out.println("");
		
		System.out.println("---Pre Order---");
		tree.preOrderTraverseTree(tree.root);
		System.out.println("");
		
		System.out.println("---Post Order---");
		tree.postOrderTraverseTree(tree.root);
	}

}
