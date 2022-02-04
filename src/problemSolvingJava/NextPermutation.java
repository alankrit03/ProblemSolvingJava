package problemSolvingJava;

public class NextPermutation {

	public static void main(String[] args) {
		NextPermutation obj = new NextPermutation();
		int[] array = {5,1,1};
		obj.nextPermutation(array);
		for(int item:array)
			System.out.print(item+" ");

	}
	
	public void nextPermutation(int[] nums) {
		int n = nums.length;
		int i = n-2;
		while (i>=0 && nums[i]>=nums[i+1]) {
			i--;
		}
		if(i>=0) {
			int nextGreater = findNextGreater(nums, i);
			int temp = nums[nextGreater];
			nums[nextGreater] = nums[i];
			nums[i] = temp;
		}
		reverseAfter(nums,i+1);
    }
	
	public int findNextGreater(int[] nums, int pos) {
		int res = 0;
		for(int i=nums.length-1; i>pos; i--) {
			if(nums[i]>nums[pos]) {
				res = i;
				break;
			}
		}
		return res;
	}
	
	public void reverseAfter(int[] nums, int start) {
		int n = nums.length;
		int iterations = (n - start)/2;
		int temp;
		for(int i=0; i<iterations; i++) {
			temp = nums[start+i];
			nums[start+i] = nums[n-i-1];
			nums[n-i-1] = temp;
		}
	}

}
