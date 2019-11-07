package RongQiLeiTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
       /* Map  m2 = new TreeMap();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        m2.put("A",1);
        m2.put("B",2);
        System.out.println(m1.containsKey("one"));
        System.out.println(m2.containsValue(2));
        System.out.println("***********");
        if (m1.containsKey("two")){
            int i = (int) m1.get("two");
            System.out.println(i);
        }*/
        /*for (int i = 0; i < args.length; i++) {
            int freq = (int) m1.get(args[i]);
            m1.put(args[i],(freq == 0? 1:freq+1));
        }
        System.out.println(m1.size()+" 个字符被发现");
        System.out.println(m1);*/

        Map<Integer,String> treemap = new TreeMap<>();
        treemap.put(20,"aa");
        treemap.put(3,"bb");
        treemap.put(6,"cc");

        //按照key递增的方式排序
        for(Integer key:treemap.keySet()){
            System.out.println(key+"--"+treemap.get(key));
        }

        Map<Emp,String> treemap2 = new TreeMap<>();
        treemap2.put(new Emp(100,"zhangsan",20000),"A");
        treemap2.put(new Emp(101,"lisi",15000),"B");
        treemap2.put(new Emp(102,"wangwu",10000),"C");
        treemap2.put(new Emp(103,"zhaoliiu",10000),"D");

        //按照key递增的方式排序
        for (Emp key:treemap2.keySet()){
            System.out.println(key+"---"+treemap2.get(key));
        }

    }

}

class Emp implements  Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp o) {//负数：小于；0：等于；正数：大于
        if (this.salary>o.salary){
            return 1;
        }else if (this.salary < o.salary){
            return -1;
        }else{
            if (this.id>o.id){
                return 1;
            }else if (this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
