package problemSolvingJava;

public class SearchElementInSortedAndRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int left = binarySearch(nums,0,pivot+1,target);
        int right = binarySearch(nums,pivot+1,nums.length,target);
        return Math.max(left, right);
    }
	
	public int findPivot(int[] nums) {
		int lo=-1,hi=nums.length-1;
		int mid;
		while(hi-lo>1) {
			mid=(hi+lo)/2;
			if(nums[mid]>nums[nums.length-1])
				lo=mid;
			else
				hi=mid;
		}
		return lo;
	}
	
	public int binarySearch(int[] nums,int lo,int hi, int target) {
		int mid;
		while(hi-lo>1) {
			mid=(hi+lo)/2;
			if(nums[mid]<=target)
				lo=mid;
			else
				hi=mid;
		}
		if(nums[lo]==target)
			return lo;
		return -1;
	}

}
