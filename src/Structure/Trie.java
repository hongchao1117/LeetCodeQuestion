package Structure;

/**
 *
 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。

 示例:

 Trie trie = new Trie();

 trie.insert("apple");
 trie.search("apple");   // 返回 true
 trie.search("app");     // 返回 false
 trie.startsWith("app"); // 返回 true
 trie.insert("app");
 trie.search("app");     // 返回 true
 */
public class Trie {
    private class TrieNode{
        private boolean isEnd;
        private TrieNode[] next;

        public TrieNode(){
            isEnd = false;
            next = new TrieNode[26];
        }
    }
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0,ch; i < word.length(); i++) {
            ch = word.charAt(i) -'a';
            if (cur.next[ch] == null)
                cur.next[ch] = new TrieNode();
            cur = cur.next[ch];
        }
        cur.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
       TrieNode cur = root;
        for (int i = 0,ch; i < word.length(); i++) {
            ch = word.charAt(i) -'a';
            if (cur.next[ch] ==  null)
                return false;
            cur = cur.next[ch];
        }
        return cur.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (int i = 0,ch; i < prefix.length(); i++) {
            ch = prefix.charAt(i) -'a';
            if (cur.next[ch] == null)
                return false;
            cur = cur.next[ch];
        }
        return true;
    }
}
