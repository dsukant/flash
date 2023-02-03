package Tree;

import java.util.Stack;

public class BinaryTree {
	Node root;
	
	void inorder() {
		
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(curr != null) {
			s.push(curr);
			curr = curr.left;
		}
		curr = s.pop();
		System.out.println(curr.key);
		curr = curr.right;
		
	}
	
	
//	static Node temp = root;
//	static int count=0;
//	
//	public void inorder(Node temp) {
//		if(temp == null) {
//			return;
//		}
//		inorder(temp.left);
//		System.out.println(temp.key + " ");
//		inorder(temp.right);
//	}
//	
//	public void countInorder(Node temp, int n) {
//		
//		if (temp == null) {
//			return;
//		}
//		if (count<=n) {
//			countInorder(temp.left, n);
//			countInorder(temp.right,n);
//			count ++;
//			if (count == n) {
//				System.out.println(temp.key);
//			}
//			
//		}
//	}
	
}
