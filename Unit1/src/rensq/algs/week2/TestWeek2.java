package rensq.algs.week2;

import java.util.Scanner;

/**
 * Created by rensq on 2017/12/4.
 */
public class TestWeek2 {

    public static void main(String[] args){
        //testStack();
        testQueue();
    }

    private static void testStack() {
        StackOfStrings stack = new ResizingArrayStackOfStrings();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            if (s.equals("-")) {
                System.out.println(stack.pop());
            }else{
                stack.push(s);
            }
            System.out.println("stack size = " + stack.size());
        }
    }

    private static void testQueue() {
        QueueOfStrings queue = new LinkedQueueOfStrings();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.next();
            if (s.equals("-")) {
                System.out.println(queue.dequeue());
            }else{
                queue.enqueue(s);
            }
            System.out.println("queue size = " + queue.size());
        }
    }
}
