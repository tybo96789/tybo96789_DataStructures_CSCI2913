package HW_7;

/**Implementation of priority queue ADT via heap
 *
 * @author Tyler Atiburcio
 */
public class PriorityQueue<T> {
    
    private int items;                   //Items currently in tree
    private Object[] data;               //Data array of nodes
    private int[] priority;              //Array to hold priority data
    private int[] entered;               //Timestamp of node 
    
    /**Makes a Priority Queue with the starting size of 10
     * 
     */
    public PriorityQueue()
    {
        this.entered = new int[10];
        this.items = 0;
        this.priority = new int[10];
    }
    
    /**Add Node to the heap given the priority
     * 
     * @param data The data to be associated with the node
     * @param priority The priority the node should have in the queue
     */
    public void add(T data, int priority)
    {   
        //If inital data array is empty
        if(this.data == null)
            this.data =  new Object[10];
        //Double the size of all arrays if their are more items than array space
        if(items == this.data.length)
        {
            Object[] temp = new Object[this.data.length*2];
            System.arraycopy(this.data, 0,temp , 0, this.data.length);
            this.data = temp;
            
            int[] temp1 = new int[this.priority.length*2];
            System.arraycopy(this.priority, 0,temp1 , 0, this.priority.length);
            this.priority = temp1;
            
            int[] temp2 = new int[this.entered.length*2];
            System.arraycopy(this.entered, 0,temp2 , 0, this.entered.length);
            this.priority = temp2;
        }
        this.data[items] = data;
        this.priority[items] = priority;
        this.entered[items] = items++;
        this.reHeapUpwards(items-1);
    }
    
    /**Move the new up the tree to keep the properties of b-tree
     * 
     * @param loc The location to start comparing 
     * @return new location to start comparing priorities
     */
    private int reHeapUpwards(int loc)
    {
        if(loc == 0 || (this.priority[(loc-1)/2] > this.priority[loc])) return loc;
        swap(loc,(loc-1)/2);
        return (loc-1)/2;
    }
    
    /**Swap the data between the two indexies,
     * parallel to the 3 data arrays
     * 
     * @param locA Index of one Node
     * @param locB Index of another Node
     */
    private void swap(int locA, int locB)
    {
        Object temp = this.data[locA];
        this.data[locA] = this.data[locB];
        this.data[locB] = temp;
        
        int temp1 = this.priority[locA];
        this.priority[locA] = this.priority[locB];
        this.priority[locB] = temp1;
        
        temp1 = this.entered[locA];
        this.entered[locA] = this.entered[locB];
        this.entered[locB] = temp1;
    }
    
    /**Remove node from the queue (Root of tree)
     * 
     * @return Data associated with that node
     */
    public T remove()
    {
        //If heap is empty, return null
        if(this.items == 0) return null;
        //Move root to end
        swap(0,--items);
        //Begin reheapification downward by swaping the root with its children until it's a b-tree again
        int loc = 1;
        while(this.priority[loc] > this.priority[(loc-1)/2])
        {
            //If both children have the same priority, compare them by when they were entered into the array
            if(this.priority[loc*2+1] == this.priority[(loc+1)*2])
            {
                if(this.entered[(loc*2+1)] < this.entered[(loc+1)*2])
                {
                    swap((loc*2+1),loc);
                    loc = (loc*2+1);
                }
                else
                {
                    swap((loc+1)*2,loc);
                    loc = (loc+1)*2;
                }
            }
            //Check left child
            else if(this.priority[loc*2+1] > this.priority[loc])
            {
                swap((loc*2+1),loc);
                loc = loc*2+1;
            }
            //Check right child
            else if(this.priority[(loc+1)*2] > this.priority[loc])
            {
                swap(loc,(loc+1)*2);
                loc = (loc+1)*2;
            }
            
        }
        return (T) this.data[items];
    }
    
    public int getItems() {
        return items;
    }

    public Object[] getData() {
        return data;
    }

    public int[] getPriority() {
        return priority;
    }

    public int[] getEntered() {
        return entered;
    }
    
    

}
