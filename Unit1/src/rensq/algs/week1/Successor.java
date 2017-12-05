package rensq.algs.week1;

/**
 * Created by rensq on 2017/12/5.
 */
public class Successor {

    QuickFindWeightQU qu;
    int num;
    public Successor(int S){
        num = S;
        qu = new QuickFindWeightQU(S);
    }

    public void remove(int i){
        if (i >= num - 1){
            return;
        }
        qu.union(i,i+1);
        System.out.println("remove " + i);
    }

    public int getSuccessor(int i){
        return qu.find(i);
    }

    public void test(int i){
        if (i < 0 || i >= num){
            throw new IllegalArgumentException("访问越界!");
        }
        remove(i);
        System.out.println("getSuccessor("+i+") = " + getSuccessor(i));
    }
}
