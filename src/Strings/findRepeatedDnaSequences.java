package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。
 * 在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
 * <p>
 * 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。
 */
public class findRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        int len = s.length();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= len - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (!map.containsKey(substring)) {
                map.put(substring, 1);
            } else if (map.get(substring) == 1) {
                list.add(substring);
                map.put(substring, 2);
            }
        }
        return list;
    }
}
