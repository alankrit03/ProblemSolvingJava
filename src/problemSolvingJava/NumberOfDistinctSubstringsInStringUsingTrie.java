package problemSolvingJava;




class TrieNode{
	TrieNode[] links;
	
	public TrieNode() {
		links = new TrieNode[26];
	}
}


public class NumberOfDistinctSubstringsInStringUsingTrie {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int countDistinctSubstrings(String s) {
		TrieNode root = new TrieNode();
		int ans = 0;
		int n = s.length();
		String temp;
		for(int i=0;i<n;i++) {
			temp="";
			TrieNode currNode = root;
			for(int j=i;j<n;j++) {
				char ch=s.charAt(j);
				if(currNode.links[ch-'a']==null) {
					currNode.links[ch-'a'] = new TrieNode();
					ans++;
				}
                currNode = currNode.links[ch-'a'];
			}
		}
		return ans+1;
	}
}