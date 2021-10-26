/**��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������
 * һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 * �ܽ᣺ʹ����������ʱ��ע��ʹ�õ��������һ���Ƿ񱻳�ʼ���ˣ���Ȼ�ᱨ�������length����ʱ�̶�����
 * ����ʹ������Ϊ���������ѭ������;foreachѭ������������е�ÿһ��Ԫ�أ�����δ��ֵ���������Ȼ��
 * ���ֺ�length����һ��������
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