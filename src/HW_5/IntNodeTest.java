package HW_5;

/**
 *
 * @author Tyler_Atiburcio
 */
public class IntNodeTest {
    
    
    public static void main(String[] args) {
        
        //Standard Case
        System.out.println("Standard Case");
        IntNode leader = new IntNode(1,new IntNode(2,new IntNode(3,null)));
    
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());

        System.out.println("\n");
        IntNode reverseLeader = IntNode.reverseOrder(leader);
        
        for( IntNode pointer = reverseLeader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());
        
        //Boundary Case
        //2 Nodes in list
        System.out.println("Boundary Case");
        System.out.println("2 Nodes in list\n");
        leader = new IntNode(1,new IntNode(2,null));
    
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());

        System.out.println("\n");
        reverseLeader = IntNode.reverseOrder(leader);
        
        for( IntNode pointer = reverseLeader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());
        
        //Boundary Case
        //1 Nodes in list
        System.out.println("Boundary Case");
        System.out.println("1 Nodes in list\n");
        leader = new IntNode(1,null);
    
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());

        System.out.println("\n");
        reverseLeader = IntNode.reverseOrder(leader);
        
        for( IntNode pointer = reverseLeader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());
        
        //Boundary Case
        //2 Nodes in list
        System.out.println("Boundary Case");
        System.out.println("0 Nodes in list\n");
        leader = null;
    
        for( IntNode pointer = leader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());

        System.out.println("\n");
        reverseLeader = IntNode.reverseOrder(leader);
        
        for( IntNode pointer = reverseLeader; pointer != null; pointer = pointer.getNext())
            System.out.println(pointer.getData());
    }
}
