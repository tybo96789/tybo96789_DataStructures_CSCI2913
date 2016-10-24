package review;

/**
 *
 * @author Tyler Atiburcio
 */
public class Recursion {
    
    private final static int num = 8;
    
    public static void main(String[] args) {
        
        System.out.println(factorial(num));
        
        int result = 1;
        for (int i = num; i > 0; i--) 
            result *= i;
        System.out.println(result);
            
    }
    
    public static int factorial(int n)
    {
        return n<=0 ? 1 : n*factorial(n-1);
    }

}
