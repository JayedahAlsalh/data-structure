import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
public class Mangment {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student team[]=new Student[3];
        System.out.println("enter your id,name");
        for (int i = 0; i < team.length; i++) {
            Student s=new Student(in.nextInt(),in.next());
            team[i]=s;}
        for (int i = 0; i < team.length; i++) {


        System.out.println(team[i].toString());

    }
        }}

