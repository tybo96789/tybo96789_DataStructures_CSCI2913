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
        Scanner scan = new Scanner(s);
        Stack<Character> charStack = new Stack<>();
        Stack<Boolean> booStack = new Stack<>();
        while(scan.hasNext())
            for(char c : scan.next().toCharArray())
            {
                System.out.print(c);
                if(c != ' ' && c !=')') charStack.push(c);
                else if(c == ')')
                {
                    charStack.push(c);
                    evaluateStack(charStack,booStack);
                }
                else charStack.push(c);
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
        if(!charStack.isEmpty() && charStack.peek() == '!') return !booStack.pop();
        return booStack.pop();
    }
    
    private static void evaluateStack(Stack<Character> sc, Stack<Boolean> sb)
    {
        //System.out.println("calling");
        sc.pop();//Pop closing ')'
        Character data = sc.pop();
        int num[] = new int[2];
        int i = num.length-1;
        char op = ' ';
        char complexop = ' ';
        while(data != '(' && !sc.isEmpty())
        {
            //System.out.print(data);
            if(data == ' ')
            {
                data = sc.pop();
                continue;
            }

            if(Character.isDigit(data)) num[i--] = data;
            else if(op == ' ') op = data;
            else complexop = data;
            data = sc.pop();
        }
        //System.out.println(op);
        String opr;
        if(complexop != ' ')
            opr = complexop+""+op;
        else opr = ""+op;
        //System.out.println(opr);
        switch(opr)
        {
            case "<":
                sb.push(num[0] < num[1]);
                break;
            case">":
                sb.push(num[0] > num[1]);
                break;
            case "!":    
                sb.push(!sb.pop());
                break;
            case"==":
                sb.push(num[0] == num[1]);
                break;
            case"<=":
                sb.push(num[0] <= num[1]);
                break;
            case">=":
                sb.push(num[0] >= num[1]);
                break;
            case "&&":
                sb.push(sb.pop() && sb.pop());
                break;
            case "||":
                sb.push(sb.pop() || sb.pop());
                break;
            case"(":
            default:
                System.err.println("DumbAss");
                return;
        }
        //if(!sc.isEmpty() && (sc.peek() == '|' || sc.peek() == '&')) evaluateStack(sc,sb);
        /*
        boolean temp = sb.pop();
        System.out.println(temp);
        sb.push(temp);
        */
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

