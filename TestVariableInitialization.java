/**用于测试一个类中包含静态域和非静态域，当该类首次创建对象或者静态域或者静态方法被访问是，非静态域是
 * 否会被初始化
 * 结论：对于初始化类中的静态域之后并不会初始化类中的非静态non-static域
 * @author gzq
 * @version 1.0
 *  */
class Cloud{
    int posX;
    int posY;
    static int height;
    {
        posX = 100;
        posY = 100;
        System.out.println("non-static variable initialize!");
        System.out.println(height);
    }
    static
    {
        height = 10000;
        System.out.println(height);
    }
    static void staticVariableInitilization(int num){
        System.out.println("static variable initialize" + num);
    } 
}

public class TestVariableInitialization {
    public static void main(String[] args){
        //int cloudHeight = Cloud.height;
        //System.out.println(cloudHeight);
        //Cloud.staticVariableInitilization(2);
        Cloud cloud = new Cloud();
        System.out.println(cloud.posX);
    }
}
