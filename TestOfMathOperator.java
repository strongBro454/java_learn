/**测试算数运算符的应用
 * 总结：当多个基本类型的数据进行四则基本运算或求余，会将所有数据转成相同的，容量较大的那个数据类型，结果也为
 * 这个较大的基本数据类型
 * @author gzq
 * @version 1.0
 * @date 2021/11/04
 */
public class TestOfMathOperator {
    public static void main(String[] args){
        System.out.println(7 / 2);
        System.out.println(7 / 2.0);
        System.out.println(7.0 / 2);
        System.out.println(7.0 / 2.0);

        int i = 7 - 2;

        //i = 7 % 2.0;

        System.out.println(7 * 2);
        System.out.println(7 * 2.0);
        System.out.println(7.0 * 2);
        System.out.println(7.0 * 2.0);

        System.out.println(7 + 2);
        System.out.println(7 + 2.0);
        System.out.println(7.0 + 2);
        System.out.println(7.0 + 2.0);

        System.out.println(7 - 2);
        System.out.println(7 - 2.0);
        System.out.println(7.0 - 2);
        System.out.println(7.0 - 2.0);

        System.out.println(-7 % -2);

        System.out.println(3510 / 1000 * 1000);

        short s = 3;

        s += 1;
        char c = 'a';
        c = (char)(c + 1);

        System.out.println(c);
    }
}
