import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> queue=new ArrayQueue<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("input queue element");
        for (int i = 0; i < 5; i++) {
            queue.enqueue(in.next().charAt(0));
            System.out.println("first="+queue.first());
            System.out.println("size"+queue.size());
        }
        System.out.println("all element are");
        while (!queue.IsEptyt()){
            System.out.println(queue.dequeue()+"\t");
        }
    }
}
