package rensq.algs.week2;

/**
 * Created by rensq on 2017/12/5.
 * N 指向栈顶的指针
 * N == s.lenght 栈满，此时进行push操作之前，Array长度扩大一倍
 * 出栈时 N == s.lenght/4，Array长度缩小为原来的1/2;
 * 有效防止抖动
 */
public class ResizingArrayStackOfStrings implements StackOfStrings{

    String[] s = new String[1];
    int N = 0;

    private void resize(int capacity){
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    @Override
    public void push(String item) {
        if (N == s.length){
            resize(s.length*2);
        }
        s[N++] = item;
    }

    @Override
    public String pop() {
        String item = s[--N];
        s[N] = null; //释放内存
        if (N > 0 && N == s.length/4){
            resize(s.length/2);
        }
        return item;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }
}
