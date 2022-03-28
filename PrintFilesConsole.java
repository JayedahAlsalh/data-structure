import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
public class PrintFilesConsole {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> q= new ArrayQueue<>(3);
        Scanner in=new Scanner(System.in);
        System.out.println("input file to print");
        for (int i = 0; i < 3; i++) {
            q.enqueue(in.next());
        }while (!q.IsEptyt()){
            Scanner fs=new Scanner(new File(q.dequeue()));
            while (fs.hasNextLine())
                System.out.println(fs.nextLine());
        }
    }
}
