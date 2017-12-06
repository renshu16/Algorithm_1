package rensq.algs.week2;

/**
 * Created by rensq on 2017/12/6.
 */
public interface QueueOfStrings {

    void enqueue(String item);
    String dequeue();
    boolean isEmpty();
    int size();
}
