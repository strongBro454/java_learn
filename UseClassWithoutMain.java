/**测试使用一个不包含public类且不包含main（）方法的类
 * @author gzq
 * @version 1.0
 * @date 2021/10/20
 */
public class UseClassWithoutMain {
    public static void main(String[] args){
        System.out.println(ClassWithoutMain.i);
        ClassWithoutMain.i = 10;
        System.out.println(ClassWithoutMain.i);
    }   
}
