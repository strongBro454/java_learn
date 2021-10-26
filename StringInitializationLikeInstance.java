/**使用实例初始化的方式初始化String域
 * 总结：实例初始化的方式就是new，对于string以及基本类型这些特殊类型则可以直接赋值如string对象就可以
 * 以双引号括起的字符串直接赋值
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class StringInitializationLikeInstance {
    public static void main(String[] args){
        new StringFieldStorage();
    }
}

class StringFieldStorage{
    String str;
    {
        str = "i am a string field!";
        System.out.println(str);
    }

    StringFieldStorage(){
        System.out.println("let me see where i am");
    }
}
