package biao;

public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        String aa = "n";
        System.out.println(helloString);
        //System.out.println(helloArray);
        String a = "hello word";
        int b = a.length();
        System.out.println(b);
        String cainiao = "菜鸟教程";
        System.out.println("1." + cainiao + "网址是" + "www.cainiaojiaoc.com");
        System.out.println(a.concat(cainiao));
        for (int i = 0; i < a.length(); i++) {
            char aaa = a.charAt(i);
            System.out.println(aaa);
        }
        //字符串长度
        int len = helloString.length();
        //根据位置获取字符
        char cha = helloString.charAt(1);
        //获取字符在字符串中的位置
        int ind = helloString.indexOf(aa);
        //从位置2后获取aa出现的第一次的位置
        int ind2 = helloString.indexOf(aa, 2);
        // 获取aa 在 helloString第一次出现的位置
        int ind3 = helloString.indexOf(aa);
        //获取aa最后出现的位置
        int ind4 = helloString.lastIndexOf(aa);
        //判断是否以指定字符串str1开头、结尾
        boolean sta = helloString.startsWith(aa); //开头
        boolean end = helloString.endsWith(aa);//结尾
        //判断是否包含某一子串
        boolean con = helloString.contains(aa);
        //判断字符串是否有内容
        boolean ise = helloString.isEmpty();
        //忽略大小写判断字符串是否相同
        boolean equ = helloString.equalsIgnoreCase(aa);
        //将字符数组 -char[] ch- 转化成字符串
        String str1 = new String(helloString); //将整个数组变成字符串
        System.out.println("..............");
    }
}
