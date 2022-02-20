package problemSolvingJava;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Find the element that appears once in a sorted array, and the rest element appears twice (Binary search)

	public int singleNonDuplicate(int[] nums) {
        int lo=0,hi = nums.length;
        int mid;
        while(hi-lo>1) {
        	mid = (hi+lo)/2;
            mid = (mid%2==1) ? mid-1 : mid;
            if(nums[mid]==nums[mid+1])
            	lo = mid+2;
            else
            	hi = mid+1;
        }
        return nums[lo];
	}
}
