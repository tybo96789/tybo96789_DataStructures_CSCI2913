package HW_5;

/**
 *
 * @author Tyler_Atiburcio
 */
public class IntNodeTest {
    
    
    public static void main(String[] args) {
        IntNode leader = new IntNode(1,new IntNode(2,new IntNode(3,null)));
    
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
        {
            System.out.println(pointer);

        }
        System.out.println("\n\n");
        IntNode reverseLeader = IntNode.reverseOrder(leader);
        
        for( IntNode pointer = reverseLeader; pointer != null; pointer = pointer.getNext())
        {
            System.out.println(pointer);

        }
        System.out.println("\n\n");
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
        {
            System.out.println(pointer);

        }
    }
}
