package problemSolvingJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSetUsingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> AllPossibleStrings(String s){
        List<String> ans = new ArrayList<String>();
        int n = s.length();
        String temp;
        for(int i=1;i<(1<<n);i++) {
        	temp = "";
        	for(int j=0;j<n;j++) {
        		if((i & (1<<j)) != 0) {
        			temp+=s.charAt(j);
        		}
        	}
        	ans.add(temp);
        }
        Collections.sort(ans);
		return ans;
    }

}
