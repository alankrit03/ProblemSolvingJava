package problemSolvingJava;

public class FindTheDuplicateInAnArrayOfIntegers {

	public static void main(String[] args) {
		FindTheDuplicateInAnArrayOfIntegers obj = new FindTheDuplicateInAnArrayOfIntegers();
		int[] array = {2,5,9,6,9,3,8,9,7,1};
		int ans = obj.findDuplicate(array);
		System.out.println(ans);

	}
	
	public int findDuplicate(int[] nums) {
        int fast, slow;
        fast = slow = nums[0];
        do {
        	slow = nums[slow];
        	fast = nums[nums[fast]];
        }while(slow!=fast);
        
        fast = nums[0];
        while(slow!=fast) {
        	slow = nums[slow];
        	fast = nums[fast];
        }
        
        return slow;
    }
}