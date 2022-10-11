package p20220923;

import java.util.ArrayList;

/**
 * 测试字符串常量池的内容
 */

 public class TestStringPool{
    public static void main(String[] args) {
        String s1 = new String("1");
        s1.intern();
        String s2 = "1";

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";

        System.out.println("s1 == s2 ?" + (s1 == s2));
        System.out.println("s3 == s4 ?" + (s3 == s4));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        ArrayList<String> arrayList = new ArrayList<Object>();
        ArrayList<Object> arrayList2 = new ArrayList<String>();
        ArrayList<String>[] lists = new ArrayList[10];
        
        
    }
 }