package HW_2;

/**
 *
 * @author Tyler Atiburcio
 */
public class Statistician {
    
    private double sum = 0, lastEnter = Double.NaN, largest = Double.NaN, smallest = Double.NaN;
    private int length = 0;

    public Statistician() {
        
    }
    
    public void nextNumber(double val)
    {
        largest = length == 0 || val > largest ? val : largest;
        smallest = length == 0 || val < smallest ? val : smallest;
        lastEnter = val;
        sum+= val;
        length++;
    }

    public double getSum() {
        return sum;
    }

    public double getLastEnter() {
        return lastEnter;
    }

    public double getLargest() {
        return largest;
    }

    public double getSmallest() {
        return smallest;
    }

    public int getLength() {
        return length;
    }
    
    public double getMean()
    {
        return this.length == 0 ? 0 : this.getSum()/this.getLength();
    }
    
    
    
    

}
