package review;

/**
 *
 * @author Tyler Atiburcio
 */
public class HashTable {
    
    Record hash[] = new Record[100];
    
    public static void main(String[] args) {
        
    }
    
    public Record search(int key)
    {
       int hashkey = key%hash.length;
       if(hash[hashkey].getKey() == key) return hash[hashkey];
       int newHashVal = (hashkey==700) ? 0: (hashkey+1);
       if(hash[hashkey].key == 0) return null;
       for(;;)
       {
           if(hash[newHashVal].getKey() == key) return hash[newHashVal];
           if(hash[newHashVal].getKey() == 0) return null;
           if(newHashVal == hashkey) return null;
           newHashVal = (newHashVal == hash.length-1) ? 0 : (newHashVal+1);
       }
    }
    
    static class Record{
        
        private int key;
        
        
        public Record(int key)
        {
            this.key = key;
        }
        
        public int getKey()
        {
            return this.key;
        }
        
    }
}
