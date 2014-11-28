package practice.linked.list;

public class BinaryTree {
	
	Node root;
	
	BinaryTree(){

		root = new Node();
		root=null;
	}
	
	void insert(int num){
		
		if(root!=null)
		{
			insert(root,num);
		}
		else{
			root= new Node();
			root.num=num;
			root.left=null;
			root.right=null;
		}
	}
	void insert(Node leaf,int key){
		
		if(key < leaf.num){
			
			if(leaf.left != null){
				insert(leaf.left,key);
			}else{
				leaf.left = new Node();
				leaf.left.num=key;
				leaf.left.left=null;
				leaf.left.right=null;
			}
			
		}else if(key >= leaf.num){
			
			if(leaf.right != null){
				insert(leaf.right,key);
			}
			else{
				leaf.right = new Node();
				leaf.right.num=key;
				leaf.right.left = null;
				leaf.right.right = null;
			}
		}
		
		
	}

	void printTree(Node leaf){
		
		if(leaf != null)
		{
			
		printTree(leaf.left);
		System.out.print(leaf.num+" ");
		printTree(leaf.right);
		
		}
	}
	
	void printTree(){
		printTree(root);
	}
}
