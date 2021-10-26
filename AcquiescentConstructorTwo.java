/**验证编译器是否会自动添加默认构造器
 * 总结：确实会自动添加默认无参构造器，顺便实验了一下枚举类型，枚举类型关键字
 * enum和class是同等道理，使用时想着class时怎么用的就行
 * @author gzq
 * @version 1.0
 * @date 2021/10/17
 */
enum BlowDirection{
    east,west,south,north;
}
public class AcquiescentConstructorTwo{
    public static void main(String[] args){
        Wind w = new Wind();
        w.blow(BlowDirection.east);
    }
}

class Wind{
    void blow(BlowDirection direction){
        System.out.println("The wind blows to " + direction);
    }
}