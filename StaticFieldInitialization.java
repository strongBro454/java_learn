/**验证静态域在被使用前就初始化了，静态域的初始化可以在定义时就初始化也可以使用静态块进行初始化
 * 总结：域的初始化总是在被使用前，甚至先于构造器
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class StaticFieldInitialization {
    public static void main(String[] args){
        StaticFieldStorage.printField();
    }
}

class StaticFieldStorage{
    static int i;
    static float f = 1.2f;

    static void printField(){
        System.out.println("int field :" + i);
        System.out.println("float field :" + f);
    }

    static {
        i = 1;
    }
}
