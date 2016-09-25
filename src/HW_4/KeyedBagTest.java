package HW_4;

/**
 *
 * @author Tyler Atiburcio
 */
public class KeyedBagTest {
    
    public static void main(String[] args) {
        
        
        KeyedBag bag = new KeyedBag();
        bag.insert("Hello World", 0);
        bag.insert("Hello Web", 1);
        bag.insert("Hello Bag", 2);
        
        //Standard case
        System.out.println("Normal Case");
        System.out.println("Find item with the key " + 1 +" found? " +bag.search(1));
        System.out.println("Retreive item with the key " + 2 +" Data: " +bag.retrieve(1));
        System.out.println("Remove item with the key " + 2 +" Removed? " +bag.remove(2));
        bag.insert("Hello Bag", 2);
        
        //Boundary Case 
        //Search for item with key that doesnt exist in bag
        System.out.println("\n\nBoundary Case: Call find item with a key that doenst exist in bag");
        System.out.println("Find item with the key " + 777 +" found? " +bag.search(777));
        
        //Boundary Case
        //retieve item with key that doesnt exist in bag
        System.out.println("\n\nBoundary Case: Call reterive item with a key that doenst exist in bag");
        System.out.println("Retreive item with the key " + 888 +" Data: " +bag.retrieve(888));
        
        //Boundary Case
        //Remove an item in the bag, then call retrieve method with the same key
        System.out.println("\n\nBoundary Case: Call remove item with a key, then call reterive item with the same key");
        System.out.println("Remove item with the key " + 0 +" Removed? " +bag.remove(0));
        System.out.println("Retreive item with the key " + 0 +" Data: " +bag.retrieve(0));
        bag.insert("Hello World", 0);
        
        
        
        
    }
}
