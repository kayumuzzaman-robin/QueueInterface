import java.util.PriorityQueue;
import java.util.Queue;

// it implements the Queue Interface
public class PriorityQueueClass {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
