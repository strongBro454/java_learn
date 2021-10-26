/**网上银行以验证如何确保finalize（）方法总被调用
 * 总结：提醒编译器进行垃圾回收的功能有System.runFinalization（）,
 * Runtime.getRuntime().runFinalization(),System.gc(),但对于没被任何引用指向的对象的垃圾回收
 * 只有System,gc()是会起作用的。
 * @author gzq
 * @version 1.0
 * @date 2021/10/19 */
public class WebBank {
    public static void main(String[] args){
        WebBankUser usr1 = new WebBankUser();
        WebBankUser usr2 = new WebBankUser(true);
        new WebBankUser(true);
        usr1.logout();
        //usr2 = null;
        System.out.println("try 1");
        System.runFinalization();
        System.out.println("try 2");
        Runtime.getRuntime().runFinalization();
        System.out.println("try 3");
        System.gc();
    }
}

class WebBankUser{
    boolean logedIn;
    WebBankUser(){
        logedIn = true;
    }

    WebBankUser(boolean b){
        logedIn = b;
    }

    void logout(){
        logedIn = false;
    }

    protected void finalize(){
        if(logedIn){
            System.out.println("Error,user is still loged in!");
        }
    }
}
