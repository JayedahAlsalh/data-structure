import java.util.Arrays;

/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
//jayedah Alsalehi

public class ArrayOperation1 {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(revevse(a)));
    }
    public static int[]revevse(int[]x){
        int n=x.length-1;
        for (int i = 0; i < x.length/2; i++) {
            int t=x[i];
            x[i]=x[n];
            n--;
        }
        return x;
    }
}
