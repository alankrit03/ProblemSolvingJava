package problemSolvingJava;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        recurse(ans, new ArrayList<String>(), s, 0, s.length(),0);
        return ans;
    }
    
    static void recurse(List<List<String>> ans, List<String> temp, String s, int i, int n, int tempSize) {
    	if(i==n) {
    		ans.add(new ArrayList<String>(temp));
    		return;
    	}
    	
    	for(int idx=0; idx<n; idx++) {
    		if(isPalindrome(s, i, idx)) {
    			temp.add(s.substring(i, idx+1));
    			recurse(ans, temp, s, idx+1, n, tempSize+1);
    			temp.remove(tempSize);
    		}
    	}
    }
    
    static boolean isPalindrome(String s, int start, int end) {
    	while(start<end) {
    		if(s.charAt(start)!=s.charAt(end)) {
    			return false;
    		}
    		start++;
    		end--;
    	}
    	return true;
    }
}