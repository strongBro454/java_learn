/**测试将一个基本类型的变量传入方法，在方法内改变该变量的值，在调用方法后该变量的值会变化吗？
 * 总结：对于基本类型的变量通过方法传递，在方法内该便该变量的值，原值不变
 * @author gzq
 * @version 1.0
 * @date 2021/10/18
 */
public class BasicType {
    public static void main(String[] args){
        IntStorage a = new IntStorage(1);
        ChangeValue.changeInt(a);
        System.out.println(a.i);
    }
}

class ChangeValue{
    static void changeInt(IntStorage j){
        j.i = j.i * 10;
    }
}

class IntStorage{
    int i;

    IntStorage(int i){
        this.i = i;
    }
}
