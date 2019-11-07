package Strings;

import javax.swing.text.EditorKit;
import java.util.HashSet;
import java.util.List;
/**
 * 3.临近点查找方式：
 * 首先将所有的字符存到结构为HashSet的dic字典里去，然后将字符串的每一位挨个从a变到z,
 * 在变化的时候实时去字典里查，因为是hashset，所以复杂度是O(1)，非常快。
 * 如果查到了，则就是找到了临近点。w
 */
public class ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        if (wordList==null||wordList.size()==0)
            return 0;
        //使用hashSet
        HashSet<String> start = new HashSet<>();
        HashSet<String> end = new HashSet<>();
        //所有字符串的字典
        HashSet<String> dic = new HashSet<>(wordList);
        start.add(beginWord);
        end.add(endWord);
        return bfs(start,end,dic,2);
    }

    private int bfs(HashSet<String> start, HashSet<String> end, HashSet<String> dic, int l) {
        //双端查找时，若是有人一段出现了“断裂”，也就说不能够连上的路径，直接返回0
        if (start.size()==0)
            return 0;
        if (start.size()>end.size()){//双端查找，为了优化时间
            return bfs(end,start,dic,l);
        }
        //bfs的标记行为，即使使用过的是不重复使用
        dic.removeAll(start);
        //收集下一层临近点
        HashSet<String> next = new HashSet<>();
        for(String s:start){
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char temp = arr[i];
                //变化
                for (char c = 'a'; c < 'z'; c++) {
                    if (temp==c)    continue;
                    arr[i] = c;
                    String str = new String(arr);
                    if (dic.contains(str)){
                        if (end.contains(str))
                            return l;
                        else next.add(str);
                    }
                }
                //复原
                arr[i] = temp;
            }
        }
        return bfs(next,end,dic,l+1);
    }
}
