/**创建一个人名币纸币面值的美剧类型，通过values方法循环输出面值及其顺序ordinal（）
 * 总结：对于成员enum类型需要定义为protected或者时默认的包内访问，
 * 其次枚举类型的每个值时一个变量，命名方式需要满足变量命名时的要求且不用封号结尾。
 * enum类型的变量具有name（），toString（），ordinal（）方法，enum类具有values()方法，即以enum值
 * 构造一个enum类型的引用数组,switch方法合适用枚举类型
 * @author gzq
 * @version 1.0
 * @date 2021/10/19
 */

enum RMB
{
    $1,$2,$5,$10,$20,$50,$100
}

public class EnumOfRMB {
    public static void main(String[] args){
        RMB[] moneys = RMB.values();
        for(RMB money : moneys){
            System.out.println(money.toString() + " " + money.ordinal());
        }
        for(int i = 0;i < moneys.length;i++){
            switch(moneys[i]){
                case $1:System.out.println("this is $1");break;
                case $2:System.out.println("this is $2");break;
                case $5:System.out.println("this is $5");break;
                case $10:System.out.println("this is $10");break;
                case $20:System.out.println("this is $20");break;
                case $50:System.out.println("this is $50");break;
                case $100:System.out.println("this is $100");break;
            }
        }
    }
}
