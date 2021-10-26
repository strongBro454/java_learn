/**重载Dog的bark方法，并调用它
 * 总结：方法重载的方式有：1）参数类型不同(基本类型和其对应的包装器类型是不一样)，2）参数个数不同，
 * 3）参数顺序不同
 * @author gzq
 * @version 1.0
 * @date 2021/10/17
 */
public class DogBark {
    public static void main(String[] args){
        Integer i = new Integer(3);
        BadDog dog = new BadDog();
        dog.bark();
        dog.bark(1, "go!");
        dog.bark("leave!", 2);
        dog.move(3);
        dog.move(i);
    }
}

class BadDog{
    void bark(){
        System.out.println("barking!");
    }

    void bark(int i,String s){
        System.out.println("barking " + s + " " + i + " times");
    }

    void bark(String s,int i){
        System.out.println("howling " + s + " " + i + " times");
    }

    void move(int i){
        System.out.println("dog moves " + i + " steps backwards");
    }

    void move(Integer i){
        System.out.println("dog moves " + i + " steps forwards");
    }
}
