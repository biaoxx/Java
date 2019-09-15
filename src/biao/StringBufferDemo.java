package biao;

import java.lang.String;

/*
 *StringBuffer和StringBudder
 * StringBuffer线程安全的
 * StringBudder不是线程安全的
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("菜鸟教程");
        //存储
        //将指定数据加在容器末尾,返回值也是StringBuffer
        //数据可以任何基本数据类型
        sBuffer.append("www.");
        sBuffer.append("runoob");
        sBuffer.append(".com");
        String a = "n";
        String ss[];
        int ii[];
        int start = 0;
        int end = 3;
        int descBegin = 2;

        char cc[]= new char[end-start+descBegin];

        //sBuffer.getChars( "String ss, "int ii", "char cc");
        sBuffer.getChars(start,end,cc,descBegin);

        //sBuffer.getChars(0,3,cc,1);

        String s = new String(cc);
        System.out.println("s:"+s);

        System.out.println(sBuffer);

        //逆序
        //System.out.println(sBuffer.reverse());
        //插入  将 int 参数的字符串表示形式插入此序列中。插入的值可以为任意类型
        System.out.println("插入:" + sBuffer.insert(1, a));
        //删除
        //这里的所有包含index的操作都是含头不含尾的
        System.out.println("删除:" + sBuffer.delete(0, 5));
        //删除指定位置的字符
        System.out.println("删除:" + sBuffer.deleteCharAt(0));
        //清空StringBuffer缓冲区,清空之后数组为空下面代码执行出错
        //System.out.println("删除:"+sBuffer.delete(0,sBuffer.length()));
        //获取
        //返回索引处的值
        System.out.println("获取:" + sBuffer.charAt(1));
        //获取char字符第一次出现都位置
        System.out.println("获取:" + sBuffer.indexOf(a));
        //返回当前容量
        System.out.println(sBuffer.capacity());
        //替换下标1---3的值替换为a字符串
        System.out.println("替换:" + sBuffer.replace(1, 3, a));
        //将StringBuffer缓冲区中的指定数据存储到指定数组中

        System.out.println(StringBufferDemo.getSubString(0,10,"01234567890"));
        String [] splita= "1113,aadbv".split(",");
        System.out.println("splita: ");


        StringBuffer sbuff = new StringBuffer("xxx,yyy");

        System.out.println(sbuff.substring(3));
        String b = "  ";
        

        if(b!=null && b!="" &&b!=" "){
            System.out.println("is Null");
        }


    }


    public static String getSubString(int start,int end,String str){
        StringBuffer s = new StringBuffer(str);
        int descBegin = 0;
        char cc[]= new char[end-start+descBegin];

        //sBuffer.getChars( "String ss, "int ii", "char cc");
        s.getChars(start,end,cc,descBegin);
        return  new String(cc);
    }
}
