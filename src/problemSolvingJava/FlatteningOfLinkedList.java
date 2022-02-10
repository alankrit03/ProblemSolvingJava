package problemSolvingJava;





class FlatteningOfLinkedList {
	class Node
	{
		int data;
		Node next;
		Node bottom;
		
		Node(int d)
		{
			data = d;
			next = null;
			bottom = null;
		}
	}
	
	Node flatten(Node root){
		if(root==null || root.next == null){
		    return root;
		}
		
		root.next = flatten(root.next);
		
		root = merge(root,root.next);
		root.next = null;
		return root;
    }
    
	
	public Node merge(Node ptr1,Node ptr2) {
		if(ptr1==null){
		    return ptr2;
		}
		
		if(ptr2 == null){
		    return ptr1;
		}
		
		Node result;
		
		if(ptr1.data < ptr2.data){
		    result = ptr1;
		    result.bottom = merge(ptr1.bottom,ptr2);
		}
		else{
		    result = ptr2;
		    result.bottom = merge(ptr1, ptr2.bottom);
		}
		
		return result;
	}
}