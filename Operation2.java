import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
//jayedah Alsalehi

public class Operation2 {
    int x[];
    int numofElements;
    public Operation2(){
        x=new int[5];
        numofElements=0;
    }
    public int  addElement(int e){
        if(numofElements<x.length){
            x[numofElements]=e;
            numofElements++;
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
Operation2 test=new Operation2();
        Scanner in=new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i <7 ; i++) {
            if(test.addElement(in.nextInt())==0) {
                System.out.println("aded sucessfully");
            }
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }








    }
}
