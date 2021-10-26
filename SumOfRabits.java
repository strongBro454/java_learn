/**题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生
 * 一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 总结：使用引用数组时需注意使用的数组的那一项是否被初始化了，不然会报错；数组的length属性时固定不可
 * 轻易使用它作为遍历数组的循环条件;foreach循环会遍历数组中的每一个元素，包括未赋值的项，所以依然会
 * 出现和length属性一样的问题
 * */
public class SumOfRabits{
    public static void main(String[] args){
        PairOfRabits por = new PairOfRabits();
        new RabitStorage(por);
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < RabitStorage.sum / 2;j++){
                PairOfRabits p = RabitStorage.rabits[j];
                p.timePase();
                if(p.judgeSexualMaturity()){
                    p.rabitBorn();
                }
            }
        }
        System.out.println(RabitStorage.sum);
    }
}

class PairOfRabits{
    private int months;
    PairOfRabits(){
        this.months = 1;
    }

    boolean judgeSexualMaturity(){
        if(this.months >= 4){
            return true;
        }
        else{
            return false;
        }
    }

    void timePase(){
        this.months += 1;
    }

    void rabitBorn(){
        RabitStorage.sum += 2;
        RabitStorage.rabits[RabitStorage.sum / 2 - 1] = new PairOfRabits();
    }
}

class RabitStorage{
    static int sum;
    static PairOfRabits[] rabits;
    static {
        sum = 0;
        rabits = new PairOfRabits[1000];
    }
    RabitStorage(PairOfRabits p){
        sum = 2;
        rabits[RabitStorage.sum / 2 - 1] = p;
    }
}