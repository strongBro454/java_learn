/**类的一个构造器方法具有一个String类型的参数，构造器的内容就是打印这个参数，定义一个该类的引用数组，
 * 但是不进行初始化，测试程序运行时构造器方法是否会调用。
 * 总结：对于类的引用数组，在未对数组进行数据初始化时，是不会调用类的构造器方法的。
 * @author gzq
 * @version 1.0
 * @date 2021.+/10/19
 */
public class ArrayInitialization {
    public static void main(String[] args){
        AClassWithConstructor[] as = new AClassWithConstructor[10];
        for(int i = 0;i < 10;i++){
            as[i] = new AClassWithConstructor(new RandomOfString(i + 1).str);
        }
    }
}

class AClassWithConstructor{
    AClassWithConstructor(String s){
        System.out.println(s);
    }
}
