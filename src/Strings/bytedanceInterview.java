package Strings;

import java.util.ArrayList;
import java.util.List;

public class bytedanceInterview {
    public static void main(String[] args) {
        String[] strings = {"ab","c","ab","c","a","d"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (list.size()==0){
                list.add(strings[i]);
                continue;
            }
            if (list.contains(strings[i])){

            }
        }

    }
    public void quickSort(int[] arr,int start,int end){
        if (start<end){
            int standard = arr[start];
            int low = start;
            int high = end;
            while (low<high){
                while (low<high && standard<arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low<high && standard>=arr[low]){
                    low--;
                }
                arr[high] = arr[low];

            }
            arr[low] = standard;
            quickSort(arr,start,low);
            quickSort(arr,low+1,end);
        }
    }
}
