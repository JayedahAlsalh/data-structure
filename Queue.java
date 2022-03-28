/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
public interface Queue<E> {
    boolean IsEptyt();
    int size();
    void enqueue(E element);
    E dequeue();
    E first();
}
