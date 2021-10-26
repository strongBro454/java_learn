/**使用默认构造器初始化对象，在默认构造器中打印消息
 * @author gzq
 * @version 1.0
 * @date 2021/10/16
 */
public class AcquiascentConstructor {
    public static void main(String[] args){
        AClass ac = new AClass();
        AClass ac2 = new AClass("ac2");
    }
}

class AClass{
    AClass(){
        System.out.println("Acquiascent constructor");
    }
    AClass(String s){
        System.out.println("Overloading constructor " + s);
    }
}
