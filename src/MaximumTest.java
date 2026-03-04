public class MaximumTest {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d 和 %d 中最大的数为%d \n",
        2,3,4,maximum(2,3,4));
        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为%.1f \n",
        2.2,3.3,4.4,maximum(2.2,3.3,4.4));
        System.out.printf("%s, %s 和 %s 中最大的数为%s \n",
                "orange","apple","banana",maximum("orange","apple","banana"));
    }
}
