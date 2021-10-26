/**对于类的域，在定义时初始化，还是在构造器内初始化之间的区别
 * 总结：由于构造器并不是必定调用所以在构造器内的初始化会有可能不执行，而且对于域的初始化是在
 * 构造器执行前执行，所以初始化顺序是先定义时初始化先于构造器内的初始化，PS非静态初始化块，静
 * 态块可以在程序的任意位置
 * @author gzq
 * @version 1.0
 * @date 2021/10/16
 */
public class DifferenceOfInitialization {
    public static void main(String[] args){
        StringStorageTwo ss = new StringStorageTwo();
        System.out.println(ss.str1);
        System.out.println(ss.str2);
        System.out.println(ss.str3);
    }
}

class StringStorageTwo{
    String str1;
    String str2;
    String str3;
    StringStorageTwo(){
        str3 = new String("str3");
        System.out.println("str3 initialization");
    }
    StringStorageTwo(String s){
        str1 = s;
    }
    {
        str2 = new String("str2");
        System.out.println("str2 initialization");
    }
}
