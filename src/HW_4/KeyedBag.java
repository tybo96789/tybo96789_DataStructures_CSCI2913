package HW_4;

/**
 *
 * @author Tyler Atiburcio
 */
public class KeyedBag {
    
    private String[] data;
    private int[] key;
    private int items; 

    
    public KeyedBag(int capacity)
    {
        this.data = new String[capacity];
        this.key = new int[capacity];
        this.items = 0;
    }
    
    public KeyedBag()
    {
        this(10);
    }
    
    public void insert(String data, int key)
    {
        this.data[items] = data;
        this.key[items++] = key;
    }
    
    public boolean search(int key)
    {
        for (int i = 0; i < items; i++)
            if(this.key[i] == key) return true;
        return false;
    }
    
    public String retrieve(int key)
    {
        for (int i = 0; i < items; i++)
            if(this.key[i] == key) return this.data[i];
        return null;
    }
    
    public boolean remove(int key)
    {
        for (int i = 0; i < items; i++)
            if(this.key[i] == key)
            {
                this.key[i] = this.key[items];
                this.data[i] = this.data[items--];
                return true;
            }
        return false;
    }
    

}
