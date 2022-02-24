package problemSolvingJava;

public class ImplementTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TrieNode{
	TrieNode[] links;
	boolean isWord;
	
	public TrieNode() {
		links = new TrieNode[26];
		isWord = false;
	}
}


class Trie {
	private static TrieNode root;
	
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	if(currNode.links[word.charAt(i)-'a']==null) {
        		currNode.links[word.charAt(i)-'a'] = new TrieNode();
        	}
        	currNode = currNode.links[word.charAt(i)-'a'];
        }
        currNode.isWord = true;
    }
    
    public boolean search(String word) {
    	TrieNode currNode = root;
    	for(int i=0;i<word.length();i++) {
    		if(currNode.links[word.charAt(i)-'a']==null) {
        		return false;
        	}
        	currNode = currNode.links[word.charAt(i)-'a'];
    	}
		return currNode.isWord;
        
    }
    
    public boolean startsWith(String prefix) {
    	TrieNode currNode = root;
    	for(int i=0;i<prefix.length();i++) {
    		if(currNode.links[prefix.charAt(i)-'a']==null) {
        		return false;
        	}
        	currNode = currNode.links[prefix.charAt(i)-'a'];
    	}
    	return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
