package HW_6;

/**Use stacks to evaluate boolean expressions
 *
 * @author Tyler Atiburcio
 */
public class EvaluateBooleanExpressions {
    
    /**Method to push boolean expression to stack
     * 
     * @param s Boolean Expression
     * @return boolean; Result of the Boolean Expression
     */
    public static boolean evaluateBooleanExpression(String s)
    {
        if(s == null || s.isEmpty()) return false;  //If not empty and not null
        s = s.trim();   //Remove any extra trailing space before and after the expression
        Stack<Character> charStack = new Stack<>();
        Stack<Boolean> booStack = new Stack<>();
            for(char c : s.toCharArray())
                if(c != ' ')
                    charStack.push(c);
        while(!charStack.isEmpty())
            evaluateStack(charStack,booStack);
        if(!charStack.isEmpty())
            {
                System.err.println("Stack not Empty!");
                return false;
            }
        return booStack.isEmpty() ? false : booStack.pop();
    }
    
    /**Evaluates the boolean expression a simple expression at a time "()"
     * 
     * @param sc A stack of the characters that make up boolean expression
     * @param sb Current Stack of boolean values of already evaluated expressions
     */
    private static void evaluateStack(Stack<Character> sc, Stack<Boolean> sb)
    {
        //If Negation is on the top of the stack pop current boolean stack and push the negation of that
        if(sc.peek() == '!') sb.push(!sb.pop());
        Character data = ' ';
        String num[] = {"",""};
        int i = num.length-1;
        String opr = "";
        while((data = sc.pop() )!= '(' && !sc.isEmpty())
        {
            if(data == ' ' || data == ')' || data == '(')
                continue;
            else if(Character.isDigit(data)) num[i--] += data;
            else opr += data;
        }
        opr.trim();
        int num1, num2;
        if(!(num[0].isEmpty() && num[1].isEmpty())) //If operation is not dealing with numbers
        {
            num1 = Integer.parseInt(num[0]);
            num2 = Integer.parseInt(num[1]);
            switch(opr)
            {
                case "<":
                    sb.push(num1 < num2);
                    break;
                case">":
                    sb.push(num1 > num2);
                    break;
                case"==":
                    sb.push(num1 == num2);
                    break;
                case"=<":
                    sb.push(num1 <= num2);
                    break;
                case"=>":
                    sb.push(num1 >= num2);
                    break;
                case "=!":
                    sb.push(num1 != num2);
                    break;
                default:
                    return;
            }
        }
        else{
            //If not dealing with number comparesions, then its a boolean comparesion
            switch(opr)
            {
                case "!":    
                    sb.push(!sb.pop());
                    break;
                case"==":
                    sb.push(sb.pop() == sb.pop());
                    break;
                case "&&":
                    sb.push(sb.pop() && sb.pop());
                    break;
                case "||":
                    sb.push(sb.pop() || sb.pop());
                    break;
                case "=!":
                    sb.push(sb.pop() != sb.pop());
                    break;
                default:
                    return;
            }
        }
    }
    
    /** Generic Stack
     * 
     * @param <T> Data Type Going in
     */
    public static class Stack<T>
    {
        private Node<T> leader;
        
        public Stack()
        {
            this.leader = null;
        }
        
        public void push(T data)
        {
            this.leader = new Node(data,this.leader);
        }

        public T pop()
        {
            try{
                Node temp = leader;
                this.leader = temp.getNext();
                return (T) temp.getData();
            }catch(NullPointerException e)
            {
                System.err.println("Stack is Empty!");
                return null;
            }
        }
        
        public T peek()
        {
            return this.leader.data;
        }
        
        public boolean isEmpty()
        {
            return this.leader == null;
        }
    }
    
    /**Generic Link List
     * 
     * @param <V> Type of node (Type of data being held)
     */
    private static class Node<V>{
        private Node next;
        private V data;

        public Node(V data, Node next) {
            this.next = next;
            this.data = data;
        }
        
        public void setNext(Node next)
        {
            this.next = next;
        }
        
        public V getData()
        {
            return this.data;
        }
        
        public void setData(V data)
        {
            this.data = data;
        }
        
        public Node getNext()
        {
            return this.next;
        }

    }
}

