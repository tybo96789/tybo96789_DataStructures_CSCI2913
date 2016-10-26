package HW_6;

import java.util.Scanner;

/**
 *
 * @author Tyler Atiburcio
 */
public class EvaluateBooleanExpressions {
    
    public static boolean evaluateBooleanExpression(String s)
    {
        if(s == null || s.isEmpty()) return false;
        //If not empty and not null
        s = s.trim();
        //Scanner scan = new Scanner(s);
        Stack<Character> charStack = new Stack<>();
        Stack<Boolean> booStack = new Stack<>();
        //while(scan.hasNext())
            for(char c : s.toCharArray())
            {
                //System.out.print(c);
                if(c != ' ')
                {
                    charStack.push(c);
                    if(c == ')')evaluateStack(charStack,booStack);
                }
                //else charStack.push(c);
            }
        /*while(!charStack.isEmpty())
            System.out.print(charStack.pop());
        */
        /*
        for(char c: s.toCharArray())
            charStack.push(c);
        while(!charStack.isEmpty())
            System.out.print(charStack.pop());
        System.out.println("");
        return booStack.pop();
        */
        //System.out.println(charStack.isEmpty() + "  "+ charStack.peek());
        //if(!charStack.isEmpty() && charStack.peek() == '!') return !booStack.pop();
        if(!charStack.isEmpty() && charStack.peek() == '!')
        {
            charStack.pop();
            booStack.push(!booStack.pop());
            System.out.println("Table Flip");
        }
        //System.out.println(charStack.peek());
        //System.out.println(booStack.peek());
        while(!charStack.isEmpty())
            evaluateStack(charStack,booStack);
        if(!charStack.isEmpty()) throw new Error("Um something broke...");
        return booStack.pop();
    }
    
    private synchronized static void  evaluateStack(Stack<Character> sc, Stack<Boolean> sb)
    {
        //System.out.println("calling");
        //System.out.println(sc.peek());
        if(sc.peek() == ')')sc.pop();//Pop closing ')'
        Character data = ' ';
        
        String num[] = {"",""};
        int i = num.length-1;
        String opr = "";
        while((data = sc.pop() )!= '(' && !sc.isEmpty())
        {
            //System.out.println("data: " + data);
            //System.out.println(num[0] +"    "+ num[1]);
//            if(data == ' ')
//            {
//                data = sc.pop();
//                continue;
//            }
            if(Character.isDigit(data)) num[i--] += data;
            else opr += data;
            //data = sc.pop();
        }
        //System.out.println(op);
//        if(complexop != ' ')
//            opr = complexop+""+op;
//        else opr = ""+op;
        System.out.println(opr);
        opr.trim();
        int num1, num2;
        if(!(num[0].isEmpty() && num[1].isEmpty()))
        {
            System.out.println("int compare");
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
                case "!":    
                    sb.push(!sb.pop());
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
                case "&&":
                    sb.push(sb.pop() && sb.pop());
                    break;
                case "||":
                    sb.push(sb.pop() || sb.pop());
                    break;
                case "=!":
                    sb.push(num1 != num2);
                    break;
                //case"(":
                default:
                    System.err.println(opr);
                    return;
            }
        }
        else{
            System.out.println("Boo Stack compare");
            //System.out.println(sc.peek());
            //if((op + "" + complexop).trim().length() != 2) throw new Error("Malformed operator");
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
                //case"(":
                default:
                    System.err.println(opr);
                    return;
            }
        }
        //if(!sc.isEmpty() && sc.peek() != ')') evaluateStack(sc,sb);
        /*
        boolean temp = sb.pop();
        System.out.println(temp);
        sb.push(temp);
        */
        //if(sc.peek() != null) 
        //   if(sc.peek() == '(') sc.pop();
    }
    
    
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

