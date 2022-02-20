package problemSolvingJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		ArrayList<String> ans = new ArrayList<String>();
		HashSet<String> cache = new HashSet<String>();
		for(String item:dictionary) {
			cache.add(item);
		}
		
		dfs(ans,"",cache,s,0,s.length());
		
		return ans;
	}
	
	public static void dfs(List<String> ans, String temp, HashSet<String> cache, String s, int idx, int n) {
		if(idx==n) {
			ans.add(temp);
			return;
		}
		String word="";
		for(int i=idx;i<n;i++) {
			word+=s.charAt(i);
			if(cache.contains(word)) {
				if(i==n-1) {
					dfs(ans,temp+word,cache,s,i+1,n);
				}
				else {
					dfs(ans,temp+word+" ",cache,s,i+1,n);
				}
			}
		}
	}

}
