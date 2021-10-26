/**探索private，public，protected三者对于域的作用效果
 * 总结：不管什么访问权限控制下的域或方法对于相同类中的其他域或方法都是可见的，但是private访问控制下的
 * 域或者方法在类外就不可见了，效果类似于他的名称不可在类外出现，而对于protectd访问控制的域或方法目前
 * 为止理解为可被继承于类的子类中的其他方法访问包括重载的父类的方法，private不行
 * @author gzq
 * @version 1.0
 * @date 2021/10/15
 */
public class AccessControl{
    public static void main(String[] args){
        OuterClass ot = new OuterClass();
        System.out.println("iNum : " + ot.iNum);
        //System.out.println("fNum : " + ot.fNum);//会报错，提示该域不可见
        System.out.println("dNum : " + ot.dNum);
        ot.publicFunction();
        //ot.privateFunction();//会报错，提示该方法不可见
        ot.protectedFunction();
    }
}

class OuterClass{
    public int iNum = 1;
    private float fNum = 2.0F;
    protected double dNum = 3.14159;

    public void publicFunction(){
        iNum = 10;
        fNum = 20.0f;
        dNum = 31.4159;
        System.out.println("iNum : " + iNum);
        System.out.println("fNum : " + fNum);
        System.out.println("dNum : " + dNum);
        privateFunction();
    } 

    private void privateFunction(){
        iNum = 20;
        fNum = 40.0f;
        dNum = 62.8318;
        System.out.println("iNum : " + iNum);
        System.out.println("fNum : " + fNum);
        System.out.println("dNum : " + dNum);
    }

    protected void protectedFunction(){
        iNum = 30;
        fNum = 60.0f;
        dNum = 94.2477;
        System.out.println("iNum : " + iNum);
        System.out.println("fNum : " + fNum);
        System.out.println("dNum : " + dNum);
        privateFunction();
    }
}