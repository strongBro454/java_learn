/**类的成员变量域方法的变量在未初始化的情况下，都是什么值
 * 总结：作为类的成员变量即为类的域，会被初始化为默认值，而方法的变量未初始化就使用会报错
 * @author gzq
 * @version 1.0
 * @date 2021/10/20
 */
public class FieldOfClassInitialization {
    static int i;
    public static void main(String[] args){
        float f;
        System.out.println("i = " + i);
        //System.out.println("f = " + f);
    }
}
