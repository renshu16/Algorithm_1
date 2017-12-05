import rensq.algs.week1.QuickFindWeightQU;
import rensq.algs.week1.SocialNetworkConnQU;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by rensq on 2017/10/25.
 */
public class Test {

    public static void main(String[] args) {
//        testQF();
//        workTest1();
        wordTest2();
    }

    public static void testQF(){
//        rensq.algs.week1.QuickFindQF qf = new rensq.algs.week1.QuickFindQF(10);
//        rensq.algs.week1.QuickFindQU qf = new rensq.algs.week1.QuickFindQU(10);
        QuickFindWeightQU qf = new QuickFindWeightQU(10);
        qf.union(1,2);
        qf.union(3,4);
        qf.union(5,6);
        qf.union(7,2);
        qf.union(8,3);
        qf.union(9,4);
        qf.union(5,0);


        System.out.println(qf.connected(2,6));
        System.out.println(qf.connected(5,4));
        System.out.println(qf.connected(0,9));
        System.out.println(qf.connected(0,9));
        System.out.println("-------------------------");
        System.out.println(qf.connected(0,6));
        System.out.println(qf.connected(3,9));
        System.out.println(qf.connected(1,7));
    }

    public static void workTest1(){


        FileInputStream ins;
        try {

            ins = new FileInputStream("/Users/rensq/work/Java/Algorithm_1/Unit1/src/rensq/algs/week1/chat.log");
            SocialNetworkConnQU socialNet = new SocialNetworkConnQU(10, ins);
            String earliestConnTime = socialNet.getEarliestConTime();
            System.out.println(" the earliest connected time is :" + earliestConnTime);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static  void wordTest2(){
        QuickFindWeightQU find = new QuickFindWeightQU(10);
        find.union(1, 2);
        find.union(1, 4);
        find.union(4, 6);
        find.union(5, 2);
        System.out.println(find.find(2));
    }
}
