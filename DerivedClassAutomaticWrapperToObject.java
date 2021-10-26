/**Object类型的可变参数列表会以来自动包装机制吗？
 * 总结：对于非基本类型的Object类型的可变参数列表会直接将传入的参数转换为Object类型，既然转换为
 * 最源头的父对象，那么转换前的类型的特殊方法并不能被调用
 * @author gzq
 * @version 1.0
 * @date 2021/10/15
 */

 public class DerivedClassAutomaticWrapperToObject{
    static void ginsengOfObject(Object... ob){
        System.out.print(ob.getClass() + " ");
        //ob.bark();//报错，提示无法调用
        System.out.print("object :");
        for(Object o:ob){
            System.out.print(o + "");
        }
    }

    public static void main(String[] args){
        ginsengOfObject(new String("abcd"));
        ginsengOfObject(new Integer(1));
        ginsengOfObject(new Dog());
    }
 }

 class Dog{
     int i;

     void bark(){
         i = 1;
         System.out.print(i);
     }
 }