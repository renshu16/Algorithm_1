package rensq.algs.week1;

/**
 * Created by rensq on 2017/12/3.
 */
public class QuickFindWeightQU implements QuickFind {

    int ids[];
    int sz[];
    int max[];
    int count;


    public QuickFindWeightQU(int n){
        ids = new int[n];
        sz = new int[n];
        max = new int[n];
        count = n;
        for (int i = 0; i < n; i++) {
            ids[i] = i;
            sz[i] = 1;
            max[i] = i;
        }
    }

    private int root(int i){
        while (i != ids[i]){
            i = ids[i];
        }
        return i;
    }

    public  int count(){
        return count;
    }

    public int find(int i){
        return max[root(i)];
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int rootOfp = root(p);
        int rootOfq = root(q);
        if (rootOfp == rootOfq) return;
        if (sz[rootOfp] > sz[rootOfq]){
            ids[rootOfq] = rootOfp;
            sz[rootOfp] += sz[rootOfq];
        }else{
            ids[rootOfp] = rootOfq;
            sz[rootOfq] += sz[rootOfp];
        }
        //max[root(p)] = max[root(p)] > max[root(q)] ? max[root(p)] : max[root(q)];
        count --;
        System.out.println("p:"+p+" -- q:"+q +"; count:"+count);
        System.out.println("max["+rootOfp+"]" + "= " + (p > q ? p : q));
    }
}
