/**²âÊÔÊı×é¸³Öµ
 * @author gzq
 * @version 1.0
 * @date 2021/11/03
 */
public class TestOfArray {
    public static void main(String[] args){
        final int order = 10;
        int[] a = new int[order];
        int[] b = new int[order];
        int[] c = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] d = new int[]{-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};

        for(int i = 0;i < order;i++){
            a[i] = c[i];
            b[i] = d[i];
        }

        System.out.println(a.length);
        System.out.println(b.length);
    }
}
