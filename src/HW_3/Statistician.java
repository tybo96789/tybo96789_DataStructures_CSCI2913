package HW_3;

/**Statistician; Various methods to obtain information about the sequence
 *
 * @author Tyler Atiburcio
 * @version 2
 */
public class Statistician {
    
    /**Declaration and initialization of essential variables to their specified failsafe values:
     * Sum, Mean, Largest, Smallest, Last Entered, and Length
     */
    private double sum, lastEnter, largest,  smallest;
    private int length;
    
    
    /**Default constructor for Statistician with the empty sequence
     * 
     */
    public Statistician ()
    {
        this.length = 0;
    }
    
    /**Takes in a double and updates variables accordingly
     * 
     * Precondition: val is a double or any Real number
     * Postcondition: Length and sum  and other related variables are updated accordingly
     * 
     * @param val A real number
     */
    public void nextNumber(double val)
    {
        largest = length == 0 || val > largest ? val : largest;
        smallest = length == 0 || val < smallest ? val : smallest;
        lastEnter = val;
        sum+= val;
        length++;
    }
    
    /**Postcondition: Returns the Sum of the sequence
     * if length is 0, default should return 0
     * 
     * @return The sum of the sequence
     */
    public double getSum() {
        return this.length == 0 ? 0 : this.sum;
    }
    
    /**PostCondition: Returns the last number entered in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the last number entered in the sequence
     */
    public double getLastEnter() {
        return this.length == 0 ? Double.NaN : this.lastEnter;
    }
    
    /**PostCondition: Returns the Largest number in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the largest number in the sequence
     */
    public double getLargest() {
        return this.length == 0 ? Double.NaN : this.largest;
    }
    
    /**PostCondition: Returns the smallest number in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the smallest number in the sequence
     */
    public double getSmallest() {
        return this.length == 0 ? Double.NaN : this.smallest;
    }
    
    /**PostCondition: Return the length of the sequence
     * if length is 0, default should return 0
     * 
     * @return The amount of numbers that has been entered
     */
    public int getLength() {
        return length;
    }
    
    /**PostCondition: Returns the mean of the sequence,
     * if length is 0, default should return Double.NaN
     * 
     * @return Mean of the sequence
     */
    public double getMean()
    {
        return this.length == 0 ? Double.NaN : this.getSum()/this.getLength();
    }
    
    /**Combine Two Statisticians s1 then s2
     * if one statistician is null, return empty Statistician
     * if either statistician is empty, create a new statistician with the non-empty statistician
     * 
     * PostCondition: Return a new statistician with the information from statistician 1 and 2 
     * 
     * @param s1 Statistician
     * @param s2 Statistician
     * @return a new Statistician with all the information of Statistician 1 and 2
     */
    public static Statistician add(Statistician s1, Statistician s2)
    {
        Statistician sn = new Statistician();
        try{
            if(s1.getLength() == 0 && s2.getLength() != 0)                      //Only pull information from statistician 2 if statistician 1 is empty
            {
                sn.largest = s2.getLargest();
                sn.lastEnter = s2.getLastEnter();
                sn.length = s2.getLength();
                sn.smallest = s2.getSmallest();
                sn.sum = s2.getSum();
            }
            else if(s1.getLength() != 0 && s2.getLength() == 0)                 //Only pull information from statistician 1 if statistician 2 is empty
            {
                sn.largest = s1.getLargest();
                sn.lastEnter = s1.getLastEnter();
                sn.length = s1.getLength();
                sn.smallest = s1.getSmallest();
                sn.sum = s1.getSum();
            }
            else 
            {
                sn.largest = s1.getLargest() > s2.getLargest() ? s1.getLargest() : s2.getLargest();
                sn.lastEnter = s2.lastEnter;
                sn.length = s1.getLength() + sn.getLength();
                sn.smallest = s1.getSmallest() < s2.getSmallest() ? s1.getSmallest() : s2.getSmallest();
                sn.sum = s1.getSum() + s2.getSum();
            }
        }catch(NullPointerException e)                                          //If any statistican is null print error message and return empty statistician
        {
            System.err.println("Statistician Invalid!");
            return sn;
        }
        
        return sn;
    }

}
