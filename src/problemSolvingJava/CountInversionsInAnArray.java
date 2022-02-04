package problemSolvingJava;

import java.util.Arrays;

public class CountInversionsInAnArray {

	public static void main(String[] args) {
		long[] arr = { 1, 20, 6, 4, 5 };
		System.out.println(getInversions(arr, arr.length));

	}
	
	
    public static long getInversions(long arr[], int n) {
    	return mergeSortWithCount(arr, 0, n-1);
        
    }
    
    private static long mergeSortWithCount(long arr[], int l, int r) {
    	long count = 0;
    	if(l<r) {
    		int mid = (l+r)/2;
    		
    		long left = mergeSortWithCount(arr, l, mid);
    		long right = mergeSortWithCount(arr, mid+1, r);
    		
    		count = left+right+mergeWithCount(arr, l, mid, r);
    	}
    	return count;
    }
    
    private static long mergeWithCount(long arr[], int l, int m, int r) {
    	long[] left = Arrays.copyOfRange(arr, l, m+1);
    	long[] right = Arrays.copyOfRange(arr, m+1, r+1);
    	
    	long count = 0;
    	int i,j,idx;
    	i = j = 0;
    	idx = l;
    	int leftLen = left.length;
    	int rightLen = right.length;
    	while(i<leftLen && j<rightLen) {
    		if(left[i] <= right[j]) {
    			arr[idx++] = left[i++];
    		}
    		else {
    			count += (leftLen-i);
    			arr[idx++] = right[j++];
    		}
    	}
    	
    	while(i<leftLen) {
    		arr[idx++] = left[i++];
    	}
    	while(j<rightLen) {
    		arr[idx++] = right[j++];
    	}
    	
    	return count;
    }

}
