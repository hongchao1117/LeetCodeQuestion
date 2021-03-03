package LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private int cap;
    private Map<Integer,Integer> map = new LinkedHashMap<>();//保持插入顺序

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            int value = map.get(key);
            map.remove(key);
            //保证每次查询后，都在末尾
            map.put(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.remove(key);
        }else if (map.size()==cap){
//           int firstKey = map.entrySet().iterator().next().getKey();
//            Map.Entry<Integer, Integer> iterator = map.entrySet().iterator().next();
            Iterator<Integer> iterator = map.keySet().iterator();
            int firstKey = iterator.next();
            map.remove(firstKey);
        }
        map.put(key,value);
    }
}
