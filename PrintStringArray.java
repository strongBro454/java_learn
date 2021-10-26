/**定义一个String数组，初始化他，使用for循环打印它
 * 总结：string对象在使用会默认初始化为null，所以如果不手动初始化为“”，则string域会有初始值null，定义
 * string引用时并没有关联任何String对象，此时string数组引用不可使用，报错未初始化。
 * PS:对于随机类Random其实并不是随机的，对于同一随机种子以及上线round有固定的数值序列
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */
import java.util.*;
public class PrintStringArray{
    public static void main(String[] args){
        Random rand = new Random(34);
        String[] strs;
        //System.out.println(strs);
        strs = new String[15];
        for(int i = 0;i < 15;i++){
            strs[i] = new RandomOfString(rand.nextInt(56)).str;
        }

        for(String s : strs){
            System.out.println(s);
        }
    }
}

class RandomOfString{
    String str = "";
    RandomOfString(int length){
        Random rand = new Random(33);
        for(int i = 0;i < length;i++){
            char c = 'a';
            c += rand.nextInt(26);
            str += c;
        }
    }

}