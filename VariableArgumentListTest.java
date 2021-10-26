/**定义一个string数组类型的可变参数列表的方法，尝试使用以逗号分割的string列表和String数组分别
 * 调用它
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
public class VariableArgumentListTest {
    static void printString(String... args){
        for(String s:args){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        String[] strs = new String[10];
        for(int i = 0;i < 10;i++){
            strs[i] = new RandomOfString(i + 3).str;
        }
        printString(strs);
        printString("i am"," a "," little boy");
    }
}
