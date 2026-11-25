import java.util.*;

class LamportMutex{
    static int clock=0;
    static int n=3;

    static PriorityQueue<int[]> q=new PriorityQueue<>((a,b) -> {
        if(a[1] == b[1])
            return a[0]-b[0];
        return a[1]-b[1];
    });

    static void request(int pid){
        clock++;
        q.add(new int[]{pid,clock});
        System.out.println("Process "+pid+" requests critical section");
    }

    static void execute(){
        if(!q.isEmpty()){
            int[] p=q.poll();
            System.out.println("Process "+p[0]+" enters critical section");
            System.out.println("Process "+p[0]+" exits critical section");
            clock++;
        }
    }
    public static void main(String[] args) {
        request(1);
        request(2);
        request(3);
        while(!q.isEmpty()){
            execute();
        }
    }
}