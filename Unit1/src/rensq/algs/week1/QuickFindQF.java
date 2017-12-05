package rensq.algs.week1;

/**
 * Created by rensq on 2017/10/25.
 */
public class QuickFindQF implements QuickFind {

    private int[] id;
    public QuickFindQF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }
}
