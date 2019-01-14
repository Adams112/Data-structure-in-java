package tree;

public class AVLTree<T extends Comparable<T>> extends AbstractTree<T> {
	private AVLNode<T> nullNode;
	
	
	
	public AVLTree() {
		super();
		nullNode = new AVLNode<T>(null);
		nullNode.setLeft(nullNode);
		nullNode.setRight(nullNode);
		
		this.setRoot(nullNode);
		this.setNullNode(nullNode);
	}

	@Override
	boolean insert_p(T item) {
		// TODO
		return false;
	}

	@Override
	boolean remove_p(T item) {
		// TODO
		return false;
	}

}

class AVLNode<T extends Comparable<T>> extends AbstractTreeNode<T> {
	private int height;

	public AVLNode(T element, ITreeNode<T> left, ITreeNode<T> right) {
		super(element, left, right);
		
		this.height = 0;
	}
	
	public AVLNode(T element) {
		this(element, null, null);
	}

	public int getHeight() {
		return height;
	}
	
	public String toString() {
		//TODO
		return super.toString();
	}
	
}