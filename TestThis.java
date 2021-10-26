/**验证同一个类中的方法间的相互调用是默认有this的，不需要手动添加
 * 总结：同一个类中的方法间的相互调用时默认有添加this的，且对于构造器内调用构造器时只可以使用this代替
 * 的，不可以构造器内使用类名调用构造器。
 * @author gzq
 * @version 1.0
 * @date 2021/10/17
 */
public class TestThis {
    public static void main(String[] args){
        Flower f = new Flower(8,"love");
        f = new Flower("love");
        f= new Flower();
        f.setFlower(100, "rich");
        System.out.println("a flower with " + f.petals + " petals says " + f.flowerLanguage);
    }
}

class Flower{
    int petals;
    String flowerLanguage;
    Flower(){
        petals = 0;
        flowerLanguage = "nothing";
        System.out.println("this is a flower with no petals!");
    }

    Flower(int i){
        petals = i;
        flowerLanguage = "nothing";
        if(i < 4){
            System.out.println("this is a flower with few petals!");
        }
    }

    Flower(String s){
        this(0);
        flowerLanguage = s;
        System.out.println("this is a flower with no petals says " + s);
    }

    Flower(int i,String s){
        this(i);
        flowerLanguage = s;
        System.out.println("this is a flower with " + i + " petals says " + s);
    }

    void setPetals(int i){
        petals = i;
    }

    void setFlowerLanguage(String s){
        flowerLanguage = s;
    }

    void setFlower(int i,String s){
        setPetals(i);
        this.setFlowerLanguage(s);
    }
}
