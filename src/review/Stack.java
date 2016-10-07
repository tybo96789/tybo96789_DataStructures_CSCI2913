package review;

/**
 *
 * @author Tyler Atiburcio
 */
public class Stack {
    
    //Node leader = new Node(1,new Node(2, new Node(3, null)));
    Node leader = null;
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
    }
    
    public void push(int data)
    {
        this.leader = new Node(data,this.leader);
    }
    
    public int pop()
    {
        try{
            Node temp = leader;
            this.leader = temp.getNext();
            return (int) temp.getData();
        }catch(NullPointerException e)
        {
            System.err.println("Stack is Empty!");
            return (int) Double.NaN;
        }
    }
    
    
private static class Node{
    private Node next;
    private Object data;

        public Node(Object data, Node next) {
            this.next = next;
            this.data = data;
        }
        
        public void setNext(Node next)
        {
            this.next = next;
        }
        
        public Object getData()
        {
            return this.data;
        }
        
        public void setData(Object data)
        {
            this.data = data;
        }
        
        public Node getNext()
        {
            return this.next;
        }

}
            
            
}
