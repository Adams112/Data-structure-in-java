package tree;

public class Test {

	public static void main(String[] args) {
		bstreetest();
	}
	
	public static void bstreetest() {
		BinarySearchTree<Integer> bs = new BinarySearchTree<Integer>();
		bs.insert(5);
		bs.insert(4);
		bs.insert(6);
		
		System.out.println(bs.size());
		
	}

}
