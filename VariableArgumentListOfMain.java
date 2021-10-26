/**获取命令行参数并输出它，使用可变参数列表的方式
 * 总结：主类的main（）方法也可以改变为可变参数列表从命令行获取不同的参数
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class VariableArgumentListOfMain {
    public static void main(String... args){
        for(String s : args){
            System.out.println(s);
        }
    }
}
