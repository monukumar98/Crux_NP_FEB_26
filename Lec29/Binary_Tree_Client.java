package Lec29;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.find(40));
		bt.PerOrder();
		bt.InOrder();
		bt.PostOrder();
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
	}

}
