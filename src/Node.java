
// Import the needed libraries
import org.jfugue.pattern.Pattern; 
import org.jfugue.player.Player;

public class Node {
	
	int key;
	Pattern pattern;
	String data;
	
	Node leftNode;
	Node rightNode;
	Node parentNode;
	
	// Initialize a new player
	Player player = new Player();
	
	public Node(int key, Pattern pattern) {
		this.key = key;
		this.pattern = pattern;
	}
	
	public Pattern getPattern() {
		return pattern;
	}
	
	public String getData() {
		return data;
	}
	
	public int getKey() {
		return key;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public Node getLeftNode() {
		return leftNode;
	}
	
	public Node getParentNode() {
		return parentNode;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void playPattern() {
		player.play(pattern);
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	
	public void setParentNode(Node parentNode) {
		this.parentNode = parentNode;
	}
	
}
