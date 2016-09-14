package HW_2;

/**
 *
 * @author Tyler Atiburcio
 */
public class StatisticianTest {
    
    public static void main(String[] args) {
        
        //Standard Case
        System.out.println("Standard Case");
        Statistician s = new Statistician();
        s.nextNumber(1.1);
        s.nextNumber(-2.4);
        s.nextNumber(0.8);
        System.out.println("Len:" + s.getLength());
        System.out.println("Avg: "+s.getMean());
        System.out.println("Sum: "+ s.getSum());
        System.out.println("Last Enter: "+s.getLastEnter());
        System.out.println("Largest: "+s.getLargest());
        System.out.println("Smallest: "+s.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case 
        //len = 0
        System.out.println("Boundary Case: Empty Sequence");
        s = new Statistician();
        System.out.println("Len:" + s.getLength());
        System.out.println("Avg: "+s.getMean());
        System.out.println("Sum: "+ s.getSum());
        System.out.println("Last Enter: "+s.getLastEnter());
        System.out.println("Largest: "+s.getLargest());
        System.out.println("Smallest: "+s.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case 
        //Sum = 0
        System.out.println("Boundary Case: Sum equals 0");
        s = new Statistician();
        s.nextNumber(-1.0);
        s.nextNumber(0);
        s.nextNumber(1.0);
        System.out.println("Len:" + s.getLength());
        System.out.println("Avg: "+s.getMean());
        System.out.println("Sum: "+ s.getSum());
        System.out.println("Last Enter: "+s.getLastEnter());
        System.out.println("Largest: "+s.getLargest());
        System.out.println("Smallest: "+s.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case 
        //Repeated numbers
        System.out.println("Boundary Case: Repeated Numbers");
        s = new Statistician();
        s.nextNumber(1);
        s.nextNumber(1);
        s.nextNumber(1);
        System.out.println("Len:" + s.getLength());
        System.out.println("Avg: "+s.getMean());
        System.out.println("Sum: "+ s.getSum());
        System.out.println("Last Enter: "+s.getLastEnter());
        System.out.println("Largest: "+s.getLargest());
        System.out.println("Smallest: "+s.getSmallest());
        
    }

}
