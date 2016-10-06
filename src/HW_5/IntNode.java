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
    
    /**Creates a new Node
     * 
     * @param data An Integer
     * @param next The next node in the list
     */
    public IntNode(int data, IntNode next) {
        this.data = data;
        this.next = next;
    }
    
    /**Returns the data in the node
     * 
     * @return data An Integer
     */
    public int getData() {
        return data;
    }
    
    /**Returns the next node in the list
     * 
     * @return the nextNode in the list
     */
    public IntNode getNext() {
        return next;
    }
    
    /**Sets the data (Integer) to the node
     * 
     * @param data That is contained in the node
     */
    public void setData(int data) {
        this.data = data;
    }
    
    /**Sets the pointer to the given passed argument of the next
     * 
     * @param next The next IntNode that it should point to next
     */
    public void setNext(IntNode next) {
        this.next = next;
    }
    
    /**Reverses the order of the list
     * The head becomes the tail, the tail becomes the head
     * 
     * @param head
     * @return The head of the list
     */
    public static IntNode reverseOrder(IntNode head)
    {
        if(head == null) return null;
        else if(head.getNext() == null) return head;
        else {
            
            IntNode prev = null, temp = null;
            while(head != null)
            {
                temp = head.getNext();  //Get the next IntNode
                head.setNext(prev);     //Set the current head node to the previous node
                prev = head;            //set the previous node to the current head
                if(temp == null) return head;   //if the next node is null, meaning the ending of the list return
                head = temp;            //if the next node in the list is not null set the head to the next node in the list
            }
            return head;
        }
    }
    

}
