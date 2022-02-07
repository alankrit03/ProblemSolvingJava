package problemSolvingJava;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLinkedList obj = new MergeTwoSortedLinkedList();
		int[] arr1 = {1,2,4};
		int[] arr2 = {1,3,5};
		ListNode l1 = createLinkedList(arr1);
		ListNode l2 = createLinkedList(arr2);
		printLinkedList(l1);
		printLinkedList(l2);
		ListNode ans = obj.mergeTwoLists(l1, l2);
		
		printLinkedList(ans);

	}
	
	private static void printLinkedList(ListNode list) {
		while(list!=null) {
			System.out.printf("%d ",list.val);
			list = list.next;
		}
		System.out.println();
	}
	
	private static ListNode createLinkedList(int[] arr) {
		ListNode head=null,end=null;
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				head = new ListNode(arr[i]);
				end = head;
			}
			else {
				end.next = new ListNode(arr[i]);
				end = end.next;
			}
		}
		return head;
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	ListNode head=null,end=null;
    	while(list1!=null && list2!=null) {
    		if(list1.val<=list2.val) {
    			if(head==null) {
    				head=list1;
    				end=head;
    			}
    			else {
    				end.next = list1;
    				end = end.next;
    			}
                list1 = list1.next;
    		}
    		else {
    			if(head==null) {
    				head=list2;
    				end=head;
    			}
    			else {
    				end.next = list2;
    				end = end.next;
    			}
                list2 = list2.next;
    		}
    	}
    	if(list1!=null) {
            if(head==null)
                head = list1;
            else
    		    end.next = list1;
    	}
    	if(list2!=null) {
            if(head==null)
                head = list2;
            else
    		    end.next = list2;
    	}
    	
        return head;
    }

}
