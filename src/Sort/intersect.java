package Sort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersect {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3151,65,266,26,15,13,123,15,166,5};
        int[] nums2 = new int[]{1,5156,156,16,16184,897,894,4984,15,5};

//        List<Integer> list1 = new ArrayList<Integer>();
//        List<Integer> list2 = new ArrayList<Integer>();
//
//        for(int num:nums1){
//            list1.add(num);
//        }
//        for(int num:nums2){
//            if (list1.contains(num)){
//                list2.add(num);
//                list1.remove(Integer.valueOf(num));
//            }
//        }
//        int[] res = new int[list2.size()];
//        int i=0;
//        for(int num:list2){
//            res[i++]=num;
//        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0,j = 0; i <nums1.length && j <nums2.length;) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }

        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
