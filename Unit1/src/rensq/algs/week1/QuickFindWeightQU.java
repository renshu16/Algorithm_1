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

    public int root(int i){
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
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] > sz[j]){
            ids[j] = i;
            sz[i] += sz[j];
        }else{
            ids[i] = j;
            sz[j] += sz[i];
        }
        if(max[i] > max[j]){
            max[j] = max[i];
        } else{
            max[i] = max[j];
        }
        count --;
        //System.out.println("p:"+p+" -- q:"+q +"; count:"+count);
    }
}
