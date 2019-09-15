package biao;

import java.util.*;

public class Demo1 {
    /*
     *List数组和遍历
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Word");
        list.add("菜鸟教程");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        //迭代器Iterator
        Iterator<String> ite=list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }


    }

}
