package HW_7;

/**
 *
 * @author Tyler Atiburcio
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(1, 2);
        pq.add(2, 3);
        pq.add(3, 1);
        pq.add(4, 3);
        pq.add(5,3);
        for (int i = 0; i < pq.items; i++) {
            System.out.println(pq.data[i] + " " + pq.priority[i] + " " + pq.entered[i]);
        }
        System.out.println("");
        System.out.println(pq.remove());
        System.out.println("");
        for (int i = 0; i < pq.items; i++) {
            System.out.println(pq.data[i] + " " + pq.priority[i] + " " + pq.entered[i]);
        }

    }

}
