package problemSolvingJava;
import java.util.HashMap;

public class SortArrayOf012 {

	public static void main(String[] args) {
		int [] nums = {2,0,2,1,1,0,0,0,0,0,2,2,2,1,1,2,1,1,2,1,2,1,2,0,2,1,0,2,2,1,0,0};
		SortArrayOf012 obj = new SortArrayOf012();
		obj.dutchPartition(nums);
		for(int item: nums)
			System.out.print(item+" ");

	}
	
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
        	if(cache.containsKey(nums[i])) {
        		cache.replace(nums[i], cache.get(nums[i])+1);
        	}
        	else
        		cache.put(nums[i], 1);
        }
        int idx=0;
        for(int i=0; i<=2; i++) {
        	for(int j=cache.getOrDefault(i,0);j>0; j--) {
        		nums[idx++] = i;
        	}
        }
    }
    
    public void dutchPartition(int[] nums) {
    	int n= nums.length;
    	int lo,mid,high;
    	lo = mid = 0;
    	high = n-1;
    	while(mid<=high && mid<n) {
    		if(nums[mid]==0) {
    			swap(nums, lo, mid);
    			lo++;
    			mid++;
    		}
    		else if(nums[mid]==1) {
    			mid++;
    		}
    		else {
    			swap(nums, mid, high);
    			high--;
    		}
    	}
    }
    
    public void swap(int[] nums, int idx1, int idx2) {
    	int temp = nums[idx1];
    	nums[idx1] = nums[idx2];
    	nums[idx2] = temp;
    }

}
