package problemSolvingJava;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA, ptr2=headB;
        while(ptr1!=null || ptr2!=null) {
        	if(ptr1==ptr2) {
        		return ptr1;
        	}
        	ptr1 = ptr1.next;
        	ptr2 = ptr2.next;
        	if(ptr1==null && ptr2==null)
        		break;
        	if(ptr1==null) {
        		ptr1=headB;
        	}
        	if(ptr2==null) {
        		ptr2=headA;
        	}
        	
        }
        return null;
        
    }

}
