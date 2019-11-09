
// Tree traversals:
// https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

// Binary Search Tree
// https://www.youtube.com/watch?v=M6lYob8STMI

// Import the needed libraries
import org.jfugue.pattern.Pattern; 
import org.jfugue.player.Player;

public class BST {
	
	// Create the root Node
	Node root;
	
	// Initialize a new player
	Player player = new Player();
	
	public void addNode(int key, Pattern pattern){
		
		Node newNode = new Node(key, pattern);
		
		if(root == null) {
			root = newNode; // The root is empty, set this Node as the root
			
		} else {
			
			Node currentNode = root;
			
			Node parent;
			
			while(true) { // Create an infinite loop
				
				parent = currentNode; // start at the root node
				
				if(key < currentNode.key) { // Insert at the left
					
					currentNode = currentNode.getLeftNode();
					
					if(currentNode == null) {
						parent.setLeftNode(newNode);
						return;
					}
					
					
				} else { // Insert at the right
					
					currentNode = currentNode.getRightNode();
					
					if(currentNode == null) {
						
						parent.setRightNode(newNode);
						return;
						
					} // End if
					
				} // End else
				
				
			} // End while
			
		} // End else

	} // End addNode 
	
	public void inOrderTraverseTree(Node currentNode) { // Traversing by key
		
		if(currentNode != null) {
			inOrderTraverseTree(currentNode.getLeftNode());
			
			System.out.print(currentNode.getKey());
			System.out.print(": ");
			System.out.println(currentNode.getPattern());
			currentNode.playPattern(); // Play the sequence
			// Play the pattern
			// currentNode.playPattern(currentNode.getPattern());
			
			inOrderTraverseTree(currentNode.getRightNode());
		}
		
	} // End inOrderTraverse
	
	public void preOrderTraverseTree(Node currentNode) { // Traversing by key
		
		if(currentNode != null) {
			
			System.out.print(currentNode.getKey());
			System.out.print(": ");
			System.out.println(currentNode.getPattern());
			currentNode.playPattern(); // Play the sequence
			
			preOrderTraverseTree(currentNode.getLeftNode());
			
			preOrderTraverseTree(currentNode.getRightNode());
		}
		
	} // End preOrderTraverse
	
	public void postOrderTraverseTree(Node currentNode) { // Traversing by key
		
		if(currentNode != null) {
			
			postOrderTraverseTree(currentNode.getLeftNode());
			
			postOrderTraverseTree(currentNode.getRightNode());
			
			System.out.print(currentNode.getKey());
			System.out.print(": ");
			System.out.println(currentNode.getPattern());
			currentNode.playPattern(); // Play the sequence
		}
		
	} // End postOrderTraverse

} // End class
