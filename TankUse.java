/**tank对象有给属性标识tank是否是满的，当tank对象被清理时，如果此时tank还是满的，则需要给出提醒
 * 总结；对象在未被引用指向的时候，进行强制垃圾回收的时候，就会执行finalize（）方法中定义的内容，
 * 一般时给与输出提醒。
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class TankUse {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank(false);
        new Tank(false);
        t1.clearTank();
        t1 = null;
        System.gc();
    }
}

class Tank{
    boolean isEmpty;
    Tank(){
        isEmpty = false;
    }

    Tank(boolean b){
        isEmpty = b;
    }

    void clearTank(){
        isEmpty = true;
    }

    protected void finalize(){
        if(!isEmpty){
            System.out.println("ERROR:this tank is not empty!");
        }
    }
}