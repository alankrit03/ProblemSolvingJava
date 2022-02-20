package problemSolvingJava;

public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
    	long lo = Math.min(arr1[0], arr2[0])-1;
    	long hi = Math.max(arr1[n-1], arr2[m-1]);
    	long mid,count;
    	
//    	Our hi will always point to probable answer.
//    	lo will point to the element which cannot be our answer
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		count = countLessEqual(arr1,mid);
    		count += countLessEqual(arr2,mid);
    		if(count>=k)
    			hi=mid;
    		else
    			lo=mid;
    	}
    	return hi;
    }
    
    public int countLessEqual(int[] arr, long target) {
    	int lo=-1,hi=arr.length,mid;
    	while(hi-lo>1) {
    		mid = (hi+lo)/2;
    		if(arr[mid]<=target)
    			lo=mid;
    		else
    			hi=mid;
    	}
    	return lo+1;
    }

}
