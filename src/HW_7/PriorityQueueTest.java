package HW_7;

/**
 *
 * @author Tyler Atiburcio
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        
        //Standard Case
        pq.add(1, 2);
        pq.add(2, 3);
        pq.add(3, 1);
        pq.add(4, 3);
        pq.add(5, 3);
        for (int i = 0; i < pq.getItems(); i++) {
            System.out.println(pq.getData()[i] + " " + pq.getPriority()[i] + " " + pq.getEntered()[i]);
        }
        System.out.println("");
        System.out.println(pq.remove());
        System.out.println("");
        for (int i = 0; i < pq.getItems(); i++) {
            System.out.println(pq.getData()[i] + " " + pq.getPriority()[i] + " " + pq.getEntered()[i]);
        }

    }

}
