package review;

/**
 *
 * @author Tyler_Atiburcio
 */
public class RecursionFib {
    
    static final int  n = 10;
    static int[] fiba = new int[n+1];
    
    static final int[] data = {1,2,3};
    
    public static void main(String[] args) {
        System.out.println(fib2(n,fiba));
        System.out.println(fib(10));
        System.out.println(binary(4,data,0,data.length-1));
    }
    
    public static int fib(int n)
    {
        return n <= 1 ? n : fib(n-1) + fib(n-2);
    }
    
    public static int fib2(int n, int[]fiba)
    {
        return (fiba[n] >=0 )? fiba[n] : (fiba[n] = fib2(n-1,fiba) + fib2(n-2, fiba));
    }
    
    public static int binary(int n, int[] a, int l, int h)
    {
        if(l == h) return (a[l]==n) ? l: -1;
        return a[l+h/2] < n ? binary(n,a,(l+h)/2+1,h) :
                binary(n,a,l,(l+h)/2+1);
    }
    /*
    
    if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fib(n-1) + fib(n-2);
    */
    

}
