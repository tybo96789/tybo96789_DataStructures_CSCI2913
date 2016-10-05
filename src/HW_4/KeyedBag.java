package HW_4;

/**Keyed Bag; Store a collection of items with basic insert, search, retrieve, and remove methods
 *
 * @author Tyler Atiburcio
 */
public class KeyedBag {
    
    private String[] data;          //A string array to hold the data corresponding to a unique key
    private int[] key;              //A int array to hold the corresponding key to the corresponding data
    private int items; 

    /**A Keyed Bag constructor that creates a bag with the inital capacity of the parameter 
     * 
     * @param capacity Create the inital size of the bag with the given parameter
     */
    public KeyedBag(int capacity)
    {
        this.data = new String[capacity];
        this.key = new int[capacity];
        this.items = 0;
    }
    
    /**Default constructor that creates a bag with the inital capacity of 10
     * 
     */
    public KeyedBag()
    {
        this(10);
    }
    
    /**Insert a copy of the data and corresponding unique key at the at the first available empty slot
     * PreCondtion: The bag is not full; The bag does not already contain the same unique key to what the method is being passed to
     * PostCondition: A new copy of the entry has been added to the bag with the given key
     * 
     * @param data The data to be stored with the unique key
     * @param key The unique key to be associated data
     */
    public void insert(String data, int key)
    {
        this.data[items] = data;
        this.key[items++] = key;
    }
    
    /**Given the unique key check to see if that particular key exists in the bag
     * PreConditon: No duplicate keys exists in the bag
     * PostCondition: Return true or false if key exists in the bag
     * 
     * @param key The unique key
     * @return boolean; True if key exists in the bag; False if it doesnt exist
     */
    public boolean search(int key)
    {
        for (int i = 0; i < items; i++)
            if(this.key[i] == key) return true;
        return false;
    }
    
    /**Retrieves the corresponding data with the associated key
     * PreCondition: No duplicate keys exists in the bag
     * PostCondition: Return the data the is associated with the key
     * Default behavior: If parameter is not found the bag, return 'null'
     * 
     * @param key The unique key that is associated with a item/data
     * @return The data that is associated with the key
     */
    public String retrieve(int key)
    {
        for (int i = 0; i < items; i++)
            if(this.key[i] == key) return this.data[i];
        return null;
    }
    
    /**Remove item corresponding to the key (Parameter)
     * 
     * @param key Unique key associated with an item in the bag
     * @return Boolean; True, if item was removed, False if item was not removed
     */
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