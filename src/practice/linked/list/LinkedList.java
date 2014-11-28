package practice.linked.list;

public class LinkedList {
	
	Node head;
	
	LinkedList(){

		head = new Node();
		head=null;
	}
	
	void insert(int num){
		
		Node temp = head;
		
		if(temp != null){
			
			while(temp.next != null){
				temp=temp.next;
			}
			Node newNode = new Node();
			newNode.num = num;
			newNode.next=null;
			temp.next = newNode;
		}else{
			
			temp = new Node();
			temp.num = num;
			temp.next=null;
			head=temp;
			
		}
		
	}
	void printList(){
		Node temp = head;
		
		if(temp!=null){
			
			while(temp.next != null){
				System.out.print(temp.num +" ");
				temp=temp.next;
			}
			
		}else{
			System.out.println("The list is empty");
		}
		
	}

	public static void main(String[] args) {
	
		LinkedList myList = new LinkedList();
		BinaryTree tree = new BinaryTree();
		
		for(int i=0;i<25;i++){
			myList.insert(i);
			tree.insert(i);
		}
		
		myList.printList();
		System.out.println("");
		tree.printTree();
	}

}
