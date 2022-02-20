package problemSolvingJava;

public class Medianof2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalElements = nums1.length+nums2.length;
        double median = kthElement(nums1, nums2, nums1.length, nums2.length, (totalElements/2)+1);
        if(totalElements%2==1)
        	return median;
        
        median += kthElement(nums1, nums2, nums1.length, nums2.length, (totalElements)/2);
        return median/2;
        
    }
    
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        long lo,hi;
        
//        Below condition is necessary to handle where any length could be zero.
        if(n>0 && m>0){
            lo = Math.min(arr1[0], arr2[0])-1;
    	    hi = Math.max(arr1[n-1], arr2[m-1]);
        }
        else if(n>0){
            lo = arr1[0]-1;
    	    hi = arr1[n-1];
        }
        else{
            lo = arr2[0]-1;
            hi = arr2[m-1];
        }
    	long mid,count;
    	
//    	Our hi will always point to probable answer.
//    	lo will point to the element which cannot be our answer
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		count = countLessEqual(arr1,arr2,mid);
    		if(count>=k)
    			hi=mid;
    		else
    			lo=mid;
    	}
    	return hi;
    }
    
    public static int countLessEqual(int[] arr1, int[] arr2, long target) {
    	int count = 0,mid;
    	int lo=-1,hi=arr1.length;
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		if(arr1[mid]<=target)
    			lo=mid;
    		else
    			hi=mid;
    	}
    	count += lo+1;
    	lo = -1;
    	hi = arr2.length;
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		if(arr2[mid]<=target)
    			lo=mid;
    		else
    			hi=mid;
    	}
    	return count+lo+1;
    }

}
