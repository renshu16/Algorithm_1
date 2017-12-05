package rensq.algs.week2;

/**
 * Created by rensq on 2017/12/4.
 */
public class LinkedStackOfStrings implements StackOfStrings{

    Node first;
    int count;

    private class Node {
        String item;
        Node next;
    }

    @Override
    public void push(String item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        count ++;
    }

    @Override
    public String pop(){
        String item = first.item;
        first = first.next;
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

}
