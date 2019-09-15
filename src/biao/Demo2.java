package biao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
        /*
         *Map集合中数据是以键(key)值(value)对的形式存放得用Entry()内部类中的getKey(),getValue()来获取Key和value的值
         */
public class Demo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        //通过key键来获取value值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key" + key + "and value=" + map.get(key));
        }
        //迭代器
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key" + entry.getKey() + "and value+" + entry.getValue());
        }
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key"+entry.getKey()+"and value"+entry.getValue());
        }
        for (String v : map.values()) {
            System.out.println("value=" + v);
        }
    }
}
