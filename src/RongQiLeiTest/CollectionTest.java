package RongQiLeiTest;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("hongchao01");
        collection.add("hongchao02");
        collection.add("hongchao03");
        collection.add("hongchao04");
        collection.add("hongchao04");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s);
        }

    }
}
