package Mathmatics;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class getRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            list.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return list;
    }

}
