package problemSolvingJava;

import java.util.Arrays;
import java.util.Comparator;

class Query{
	int x,m,idx;
	Query(int x, int m, int idx){
		this.x = x;
		this.m = m;
		this.idx = idx;
	}
}


class TrieNode{
	TrieNode links[];
	TrieNode(){
		links = new TrieNode[2];
	}
}


class MyComparator implements Comparator<Query>{

	@Override
	public int compare(Query o1, Query o2) {
		return o1.m-o2.m;
	}
	
}

public class MaximumXORWithAnElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int n = queries.length;
    	Query[] queryarr = new Query[n];
    	for(int i=0;i<n;i++) {
    		queryarr[i] = new Query(queries[i][0],queries[i][1],i);
    	}
    	MyComparator ob = new MyComparator();
    	Arrays.sort(queryarr,ob);
    	Arrays.sort(nums);
    	
    	TrieNode root = new TrieNode();
    	int i=0;
    	int[] ans = new int[n];
    	for(Query curr:queryarr) {
    		while(i<nums.length && nums[i]<=curr.m) {
    			insertNumber(root,nums[i]);
    			i++;
    		}
    		if(i>0)
    		    ans[curr.idx] = maxPossibleXOR(root, curr.x);
            else
                ans[curr.idx] = -1;
    	}
    	return ans;
    }
    
    public static void insertNumber(TrieNode root, int num) {
    	for(int i=31;i>=0;i--) {
    		int idx = (num & (1<<i)) != 0 ? 1 : 0;
    		if(root.links[idx] == null)
    			root.links[idx] = new TrieNode();
    		root = root.links[idx];
    	}
    }
    
    public static int maxPossibleXOR(TrieNode root, int num) {
    	int ans = 0,bit;
    	for(int i=31;i>=0;i--) {
    		bit = (num & (1<<i)) != 0 ? 1 : 0;
    		if(root.links[(bit+1)%2] != null) {
    			ans ^= 1<<i;
    			root = root.links[(bit+1)%2];
    		}
    		else
    			root = root.links[bit];
    	}
    	return ans;
    }
}