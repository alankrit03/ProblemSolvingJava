package problemSolvingJava;
import java.util.ArrayList;
import java.util.List;

public class MajorityElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Integer> majorityElement(int[] nums) {
        int count1,count2,candidate1,candidate2;
        count1 = count2 = 0;
        candidate1 = candidate2 = nums[0];
        for(int item:nums) {
        	if(item==candidate1)
        		count1++;
        	else if(item == candidate2)
        		count2++;
        	else if(count1==0) {
        		candidate1 = item;
        		count1++;
        	}
        	else if(count2==0) {
        		candidate2 = item;
        		count2++;
        	}
        	else {
        		count1--;
        		count2--;
        	}
        }
        List<Integer> ans = new ArrayList<Integer>();
        count1 = count2 = 0;
        for(int item:nums) {
        	if (item==candidate1)
        		count1++;
        	if (item==candidate2)
        		count2++;
        }
        
        if (count1>(nums.length/3))
        	ans.add(candidate1);
        else if (count2>(nums.length/3))
        	ans.add(candidate2);
        
        System.out.println(ans);
        return ans;
    }
}
