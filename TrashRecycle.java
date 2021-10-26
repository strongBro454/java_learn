/**测试finalize（）方法的执行
 * 总结：当对象引用不再指向相应对象，那么该对象则会进入待垃圾回收状态，System.gc()只是提醒
 * 编译器可以进行垃圾回收，并不一定会进行垃圾回收
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class TrashRecycle{
    public static void main(String[] args){
        DoWhenRecycle dwr = new DoWhenRecycle();
        dwr = null;
        System.gc();
    }
}

class DoWhenRecycle{
    protected void finalize(){
        System.out.print(this + " is being recycling!");
    }
}