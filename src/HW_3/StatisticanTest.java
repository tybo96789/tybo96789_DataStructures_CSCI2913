package HW_3;

/**
 *
 * @author Tyler_Atiburcio
 */
public class StatisticanTest {
    
    public static void main(String[] args) {
        //Standard Case
        System.out.println("Standard Case");
        System.out.println("Statistician 1");
        Statistician s1 = new Statistician();
        s1.nextNumber(1.1);
        s1.nextNumber(-2.4);
        s1.nextNumber(0.8);
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        Statistician s2 = new Statistician();
        s2.nextNumber(2.2);
        s2.nextNumber(-4.8);
        s2.nextNumber(1.6);
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        Statistician s3 = Statistician.add(s1, s2);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Standard Case
        //Test Statistician 3 works normally after adding Statisticians 1 and 2
        System.out.println("Standard Case");
        System.out.println("Statistician 1");
        s1 = new Statistician();
        s1.nextNumber(1.1);
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        s2 = new Statistician();
        s2.nextNumber(2.2);
        s2.nextNumber(-4.8);
        s2.nextNumber(1.6);
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(s1, s2);
        s3.nextNumber(5.7);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case 
        //Statistician is null
        System.out.println("Boundary Case");
        System.out.println("Statistician is null");
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(null, null);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case
        //Statistician 1 is empty
        System.out.println("Boundary Case");
        System.out.println("Statistician 1");
        s1 = new Statistician();
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        s2 = new Statistician();
        s2.nextNumber(2.2);
        s2.nextNumber(-4.8);
        s2.nextNumber(1.6);
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(s1, s2);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case
        //Statistician 2 is empty
        System.out.println("Boundary Case");
        System.out.println("Statistician 1");
        s1 = new Statistician();
        s1.nextNumber(1.1);
        s1.nextNumber(-2.4);
        s1.nextNumber(0.8);
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        s2 = new Statistician();
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(s1, s2);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        //Boundary Case
        //Statistician 1 has 1 item
        System.out.println("Boundary Case");
        System.out.println("Statistician 1");
        s1 = new Statistician();
        s1.nextNumber(1.1);
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        s2 = new Statistician();
        s2.nextNumber(2.2);
        s2.nextNumber(-4.8);
        s2.nextNumber(1.6);
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(s1, s2);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
        
        
        //Boundary Case
        //Both Statistician are empty
        System.out.println("Boundary Case");
        System.out.println("Statistician 1");
        s1 = new Statistician();
        System.out.println("Len:" + s1.getLength());
        System.out.println("Avg: "+s1.getMean());
        System.out.println("Sum: "+ s1.getSum());
        System.out.println("Last Enter: "+s1.getLastEnter());
        System.out.println("Largest: "+s1.getLargest());
        System.out.println("Smallest: "+s1.getSmallest());
        
        System.out.println("\n");
        
        System.out.println("Statistician 2");
        s2 = new Statistician();
        System.out.println("Len:" + s2.getLength());
        System.out.println("Avg: "+s2.getMean());
        System.out.println("Sum: "+ s2.getSum());
        System.out.println("Last Enter: "+s2.getLastEnter());
        System.out.println("Largest: "+s2.getLargest());
        System.out.println("Smallest: "+s2.getSmallest());
        
        System.out.println("\n\n");
        
        System.out.println("Statistician 1+2");
        s3 = Statistician.add(s1, s2);
        System.out.println("Len:" + s3.getLength());
        System.out.println("Avg: "+s3.getMean());
        System.out.println("Sum: "+ s3.getSum());
        System.out.println("Last Enter: "+s3.getLastEnter());
        System.out.println("Largest: "+s3.getLargest());
        System.out.println("Smallest: "+s3.getSmallest());
        
        System.out.println("\n\n\n");
    }

}
