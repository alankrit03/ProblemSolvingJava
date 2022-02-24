package problemSolvingJava;

public class LongestStringWithAllPrefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TrieNode{
	TrieNode[] links;
	boolean isWord;
	char val;
	
	public TrieNode() {
		links = new TrieNode[26];
		isWord = false;
		val = ' ';
	}
}

class Solution {
	
	public static String completeString(int n, String[] a) {
		TrieNode root = new TrieNode();
		for(int i=0;i<n;i++) {
			TrieInsert(a[i],root);
		}
		String[] ans = new String[1];
		int[] maxLen = new int[1];
		for(int i=0;i<26;i++) {
			recurse(root.links[i],"",0,ans,maxLen);
		}
        if(ans[0]==null)
            return "None";
		return ans[0];
	}
	
	public static void recurse(TrieNode node,String temp,int size,String[] ans,int[] maxLen) {
		if(node==null || node.isWord==false) {
			return;
		}
		size++;
		temp += node.val;
		if(size>maxLen[0]) {
			maxLen[0] = size;
			ans[0] = temp;
		}
		for(int i=0;i<26;i++) {
			recurse(node.links[i],temp,size,ans,maxLen);
		}
	}
	
	public static void TrieInsert(String word, TrieNode root) {
        TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	if(currNode.links[word.charAt(i)-'a']==null) {
        		currNode.links[word.charAt(i)-'a'] = new TrieNode();
        	}
        	currNode = currNode.links[word.charAt(i)-'a'];
        	currNode.val = word.charAt(i);
        }
        currNode.isWord = true;
    }
}