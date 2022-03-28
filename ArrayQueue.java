/**
 * Created by LENOVO ALMAZEN on 30/01/2022.
 */
public class ArrayQueue <E> implements Queue<E>{
    E data[];
    int f=0;
    int sz=0;
    static final int CAPCITY=100;

    public ArrayQueue( int c) {
        data= (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPCITY);
    }

    @Override
    public boolean IsEptyt() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
      if(size()==data.length)
          throw new IllegalStateException("QUEUE IS FULL");
        int i=(f+sz)%data.length;
        data[i]=element;
        sz++;
    }

    @Override
    public E dequeue() {
        if(IsEptyt())return null;
         E del=data[f];
        sz--;
        f=(f+1)%data.length;
        return del;

    }

    @Override
    public E first() {
        if(IsEptyt())
        return null;
        return data[f];
    }
}
