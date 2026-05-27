import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
class LostLight{
    String name;
    int rank;

    LostLight(String name,int rank){
        this.name=name;
        this.rank=rank;
    }
}

public class main {
    public static void main(String[] args) {
        PriorityQueue<LostLight> queue = new PriorityQueue<>((a,b)-> Integer.compare(b.rank, a.rank));

        queue.offer(new LostLight("Rodimus", 76));
        queue.offer(new LostLight("Ultra Magnus", 100));
        queue.offer(new LostLight("Drift", 45));
        queue.offer(new LostLight("Ratchet", 89));
        queue.offer(new LostLight("Perceptor", 30));

        while(!queue.isEmpty()){
            LostLight t = queue.poll();
            System.out.println(t.name + " : " + t.rank);
        }
    }
}
