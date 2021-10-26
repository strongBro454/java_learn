/**测试一下java中方法是否支持基本类型而非其包装器类型
 * 总结：理解错误，看到的描述是：任何基本类型都不能作为类型参数大致情形为 
 * List<Integer> li = new ArrayList<Integer>();
 * 不可以 List<int> li = new ArrayList<int>();
 * 并且可变参数列表不依赖于自动包装机制的意义为：一个方法的参数定义为基本类型的可变参数列表，
 * 传入的对应基本类型的参数并不会被自动包装为对应的包装器类。
 * @author gzq
 * @version 1.0
 * @date 2021/10/15
 */
public class GinsengOfBasicTypes {
    static void functionWithGinsengOfBasicGinseng(int... i){
        System.out.print(i.getClass() + " ");
        System.out.print("num : ");
        for(int j:i){
            System.out.print(j + " ");
        }
    }

    static void functionWithGinsengOfWrapperClassGinseng(Integer... i){
        System.out.print(i.getClass() + " ");
        System.out.print("num : ");
        for(int j:i){
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        functionWithGinsengOfBasicGinseng(1);
        functionWithGinsengOfBasicGinseng(new Integer(1));
        functionWithGinsengOfWrapperClassGinseng(2);
        functionWithGinsengOfWrapperClassGinseng(new Integer(2));
    }
}
