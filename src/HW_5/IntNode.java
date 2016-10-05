package HW_5;

/** Object node linked list
 *  Single linked list
 *  -Each node onlys knows the next node
 * 
 * @author Tyler_Atixburcio
 */
public class IntNode {
    
    private int data;
    private IntNode next;
    
    /**
     * 
     * @param data
     * @param next 
     */
    public IntNode(int data, IntNode next) {
        this.data = data;
        this.next = next;
    }
    
    /**
     * 
     * @return 
     */
    public int getData() {
        return data;
    }
    
    /**
     * 
     * @return the nextNode in the list
     */
    public IntNode getNext() {
        return next;
    }
    
    /**
     * 
     * @param data That is contained in the node
     */
    public void setData(int data) {
        this.data = data;
    }
    
    /**
     * 
     * @param next The next Object Node that it should point to next
     */
    public void setNext(IntNode next) {
        this.next = next;
    }
    
    /**
     * 
     * @param head
     * @return The head of the list
     */
    public static IntNode reverseOrder(IntNode head)
    {
        if(head == null) return null;
        else if(head.getNext() == null) return head;
        else {
            
            for (IntNode cursor = head; cursor != null; cursor = cursor.getNext()) {
                
            }
             
        }
    }
    

}
