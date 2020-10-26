package Strings;

import java.util.ArrayList;
import java.util.List;

public class convert {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;
        List<StringBuilder> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char ch : s.toCharArray()) {
            res.get(i).append(ch);
            if (i == 0 || i == numRows-1) flag = -flag;
            i += flag;
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder row:res){
            sb.append(row);
        }
        return sb.toString();

    }
}
