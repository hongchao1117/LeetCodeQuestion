package Array;

import java.util.*;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String string = String.valueOf(chars);
            if (!map.containsKey(string)){
                map.put(string,new ArrayList<>());
            }
            map.get(string).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
