package HW_7;

/**
 *
 * @author Tyler Atiburcio
 */
public class PriorityQueue<T> {
    
    public int items;
    public Object[] data;
    public int[] priority;
    public int[] entered;
    
    
    public PriorityQueue()
    {
        this.entered = new int[10];
        this.items = 0;
        this.priority = new int[10];
    }
    
    public void add(T data, int priority)
    {
        if(this.data == null)
            this.data =  new Object[10];
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
    
    private int reHeapUpwards(int loc)
    {
        if(loc == 0 || (this.priority[(loc-1)/2] > this.priority[loc])) return loc;
        swap(loc,(loc-1)/2);
        return (loc-1)/2;
    }
    
    public void swap(int locA, int locB)
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
    
    
    public T remove()
    {
        swap(0,--items);
        int loc = 1;
        while(this.priority[loc] > this.priority[(loc-1)/2])
        {
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
            else if(this.priority[loc*2+1] > this.priority[loc])
            {
                swap((loc*2+1),loc);
                loc = loc*2+1;
            }
            else if(this.priority[(loc+1)*2] > this.priority[loc])
            {
                swap(loc,(loc+1)*2);
                loc = (loc+1)*2;
            }
            
        }
        return (T) this.data[items];
    }
    
    

}
