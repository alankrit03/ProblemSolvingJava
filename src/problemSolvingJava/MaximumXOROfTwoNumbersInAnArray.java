package problemSolvingJava;



class TrieNode{
	TrieNode links[];
	TrieNode(){
		links = new TrieNode[2];
	}
}


public class MaximumXOROfTwoNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(1<<5 ^ 3<<2);
		

	}
	
	
	
    public int findMaximumXOR(int[] nums) {
        TrieNode root = new TrieNode();
        int ans = 0,temp;
        for(int num:nums) {
        	insertNumber(root,num);
        	temp = maxPossibleXOR(root,num);
        	ans = Math.max(ans, temp);
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
