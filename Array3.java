import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 28/01/2022.
 */
//jayedah Alsalehi

public class Array3 {
    public static void input(int[]x){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i]=in.nextInt();
        }

    }
    public static void print(int[]y){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <y.length ; i++) {
            System.out.println(y[i]+"\t");


        }
    }

    public static void main(String[] args) {
        int[]a=new int[5];
        System.out.println("Enter numbers");
        input(a);
        System.out.println("print");
        print(a);
    }
}
