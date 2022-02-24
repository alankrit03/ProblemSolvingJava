package problemSolvingJava;

public class ImplementTrie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TrieNode{
	TrieNode[] links;
	int wordsEndingHere;
	int wordsWithPrefix;
	
	TrieNode(){
		links = new TrieNode[26];
		wordsEndingHere = 0;
		wordsWithPrefix = 0;
	}
}



public class Trie {
	
	private static TrieNode root;
    
	public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(currNode.links[ch-'a']==null) {
        		currNode.links[ch-'a'] = new TrieNode();
        	}
        	currNode = currNode.links[ch-'a'];
        	currNode.wordsWithPrefix++;
        }
        currNode.wordsEndingHere++;
    }

    public int countWordsEqualTo(String word) {
    	TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(currNode.links[ch-'a']==null) {
        		return 0;
        	}
        	currNode = currNode.links[ch-'a'];
        }
        return currNode.wordsEndingHere;
    	
    }

    public int countWordsStartingWith(String word) {
    	TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	char ch = word.charAt(i);
        	if(currNode.links[ch-'a']==null) {
        		return 0;
        	}
        	currNode = currNode.links[ch-'a'];
        }
        return currNode.wordsWithPrefix;
    }

    public void erase(String word) {
    	TrieNode currNode = root;
        for(int i=0;i<word.length();i++) {
        	currNode = currNode.links[word.charAt(i)-'a'];
        	currNode.wordsWithPrefix--;
        }
        currNode.wordsEndingHere--;
    }

}