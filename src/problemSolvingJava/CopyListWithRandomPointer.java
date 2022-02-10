package problemSolvingJava;


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public Node copyRandomList(Node head) {
    	if(head==null)
    		return head;
        Node ptr = head,temp;
        while(ptr!=null) {
        	temp = new Node(ptr.val);
        	temp.next = ptr.next;
        	ptr.next = temp;
        	ptr = temp.next;
        }
        
//        Assiging the random node now
        ptr = head;
        while(ptr!=null) {
        	temp = ptr.next;
        	if(ptr.random!=null) {
        		temp.random = ptr.random.next;
        	}
        	ptr = temp.next;
        }
//        Separating the two lists now.
        Node head2 = head.next;
        ptr = head2;
        while(ptr.next!=null) {
        	head.next = ptr.next;
        	ptr.next = ptr.next.next;
        	head = head.next;
        	ptr = ptr.next;
        }
        head.next = null;
        return head2;
        
    }

}
