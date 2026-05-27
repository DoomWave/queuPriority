import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("Rodimus");
        queue.offer("Ultra Magnus");
        queue.offer("Drift");
        queue.offer("Ratchet");
        queue.offer("Perceptor");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
