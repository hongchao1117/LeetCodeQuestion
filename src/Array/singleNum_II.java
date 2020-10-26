package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。
 * 请找出那个只出现一次的数字。
 */
public class singleNum_II {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = map.getOrDefault(nums[i], 0);
            map.put(nums[i],num+1);
        }
        for(int key:map.keySet()){
            if (map.get(key)==1){
                 return key;
            }
        }
        return -1;
    }
}
