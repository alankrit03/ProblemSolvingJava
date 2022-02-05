package problemSolvingJava;
import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> cache = new HashMap<Character,Integer>();
        int ans=0,i;
        int currStart=-1;
        for(i=0; i<s.length(); i++) {
        	int prevOccurance = cache.getOrDefault(s.charAt(i), -1);
        	if(prevOccurance>currStart) {
        		ans = Math.max(ans, i-currStart-1);
        		currStart = prevOccurance;
        	}
        	cache.put(s.charAt(i), i);
        }
        ans = Math.max(ans, i-currStart-1);
        return ans;
    }
}
