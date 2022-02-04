package problemSolvingJava;

import java.util.Arrays;

public class ReversePairs {

	public static void main(String[] args) {
		int[] arr = {40,25,19,12,9,6,2};
		int ans = mergeSortWithCount(arr, 0, arr.length-1);
		System.out.println(ans);
	}
//	NOT COMPLETEDD
	
	private static int mergeSortWithCount(int arr[], int l, int r) {
    	int count = 0;
    	if(l<r) {
    		int mid = (l+r)/2;
    		
    		int left = mergeSortWithCount(arr, l, mid);
    		int right = mergeSortWithCount(arr, mid+1, r);
    		
    		count = left+right+mergeWithCount(arr, l, mid, r);
    	}
    	return count;
    }
    
    private static int mergeWithCount(int arr[], int l, int m, int r) {
    	int[] left = Arrays.copyOfRange(arr, l, m+1);
    	int[] right = Arrays.copyOfRange(arr, m+1, r+1);
    	
    	int count = countPairs(arr, l, m, r);
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
    
    private static int countPairs(int arr[], int l, int m, int r) {
    	int count = 0;
    	int i=l, j=m+1;
    	while (i<=m && j<=r) {
    		while (j<=r && arr[i]>2*(double)arr[j]) {
    			j++;
    		}
    		i++;
    		count += (j-m-1);
    	}
    	if(i<=m) {
    		count += (j-m-1)*(m-i+1);
    	}
    	return count;
    }

}
