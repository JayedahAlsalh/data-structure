import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 28/01/2022.
 */
//jayedah Alsalehi

public class Array2 {
    public static void main(String[] args) {
        int a[]=new int[6];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers");
        for (int i = 0; i <a.length ; i++) {
            a[i]=in.nextInt();
        }
        System.out.println("print arrays");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+"\t");

        }

    }
}
