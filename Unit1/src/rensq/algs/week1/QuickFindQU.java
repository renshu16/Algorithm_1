package rensq.algs.week1;

/**
 * Created by rensq on 2017/10/27.
 */
public class QuickFindQU implements QuickFind {

    private int[] id;
    public QuickFindQU(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    private int root(int i) {
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }
    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
