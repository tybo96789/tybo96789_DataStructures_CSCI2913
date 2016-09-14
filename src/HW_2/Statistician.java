package HW_2;

/**Statistician; Various methods to obtain information about the sequence
 *
 * @author Tyler Atiburcio
 */
public class Statistician {
    
    /**Declaration and initialization of essential variables to their specified failsafe values:
     * Sum, Mean, Largest, Smallest, Last Entered, and Length
     */
    private double sum = 0.0, lastEnter = Double.NaN, largest = Double.NaN, smallest = Double.NaN;
    private int length = 0;
    
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
        return sum;
    }
    
    /**PostCondition: Returns the last number entered in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the last number entered in the sequence
     */
    public double getLastEnter() {
        return lastEnter;
    }
    
    /**PostCondition: Returns the Largest number in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the largest number in the sequence
     */
    public double getLargest() {
        return largest;
    }
    
    /**PostCondition: Returns the smallest number in the sequence
     * if length is 0, default should return Double.NaN
     * 
     * @return Returns the smallest number in the sequence
     */
    public double getSmallest() {
        return smallest;
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
        return this.length == 0 ? 0 : this.getSum()/this.getLength();
    }

}
