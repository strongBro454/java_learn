/**测试String应用的默认初始化值是什么
 * 总结：对于类的String域若未手动进行初始化则会被编译器初始化为null
 * @author gzq
 * @version 1.0
 * @date 2021/10/16
 */
public class InitializationOfString {
    public static void main(String[] args){
        StringStorage ss = new StringStorage();
        System.out.print("String object initialize as " + ss.str);
    }
}

class StringStorage{
    String str;
}