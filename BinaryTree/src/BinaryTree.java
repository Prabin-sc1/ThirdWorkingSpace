
public class BinaryTree {
	
	Node root;
	
	public void addNode(int key , String name) {
		Node  newNode = new Node(key ,name);
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			
			Node  parent
		}
	}

	public static void main(String[] args) {
		

	}

}

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
		
	}
	
	public String toString() {
		return name + " has a key " + key;
	}
}