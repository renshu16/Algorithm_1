package rensq.algs.week2;

/**
 * Created by rensq on 2017/12/6.
 */
public class LinkedQueueOfStrings implements QueueOfStrings {

    private Node first;
    private Node last;
    private int count = 0;

    private class Node{
        String item;
        Node next;
    }
    @Override
    public void enqueue(String item) {
        Node oldEnd = last;
        last = new Node();
        last.item = item;
        last.next = null;
        //判断入队之前 是否为空队列，
        if (isEmpty()){
            first = last;
        }else{
            oldEnd.next = last;
        }
        count ++;
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        String item = first.item;
        first = first.next;
        //判断出队之后，是否是空队列
        if (isEmpty()) last = null;
        count --;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return count;
    }

    public String debugInfo(){
        return null;
    }
}
