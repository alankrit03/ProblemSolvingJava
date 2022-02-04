package problemSolvingJava;
import java.util.HashMap;
import java.util.HashSet;
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		obj.longestConsecutive(nums);

	}
	private static void displayHashMap(HashMap<Integer,Integer> cache) {
		for(int key:cache.keySet()) {
			System.out.printf("key = %d, value = %d\n",key,cache.get(key));
		}
	}
	
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> cache = new HashSet<Integer>();
        for(int item:nums){
            cache.add(item);
        }
        int ans = 0;
        for(int item:nums) {
            int currSequence = 1;
            if(!cache.contains(item-1)){
                int temp = item+1;
                while(cache.contains(temp)){
                    temp++;
                    currSequence++;
                }
            }
            ans = Math.max(ans, currSequence);
        }
        return ans;
    }

}
