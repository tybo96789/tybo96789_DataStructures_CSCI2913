package review;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tyler Atiburcio
 */
public class LocationDemo {
    
    public static void main(String[] args) {
        ArrayList<Location> loc = new ArrayList<Location>();
        
        //Testing
        //System.out.println(Location.getDistance(new Location(), null));
        
        for (int i = 0; i < 9; i++) {
            loc.add(new Location());
        }
        
        System.out.println("Enter cordinates for 10th location:");
        Scanner scan = new Scanner(System.in);
        double x = 0, y = 0;
        try{
             System.out.print("X cord:");
             x = Double.parseDouble(scan.nextLine().trim());
             System.out.print("Y cord:");
             y = Double.parseDouble(scan.nextLine().trim());
             
             loc.add(new Location(x,y));
        }catch(NumberFormatException e)
        {
            System.err.println("The Input is invalid & the system will generate the 10th Node");
            loc.add(new Location());
        }
       
       
        
        
        for (Location l: loc) {
            System.out.println(l);
        }
        
        Location A = null;
        Location B = null;
        double maxDis = Double.MIN_VALUE;
        for (Location a : loc)
            for (Location b : loc)
                maxDis = (Location.getDistance(a,b) > maxDis) ? Location.getDistance(a,b) : maxDis;
        /*
        for (int i = 0; i < loc.size(); i++) {
            for (int j = i+1; j < loc.size(); j++) {
                maxDis = Location.getDistance(loc.get(i),loc.get(j)) > maxDis ? Location.getDistance(loc.get(i),loc.get(j)) : maxDis;
                /*
                if(Location.getDistance(loc.get(i),loc.get(j)) > maxDis)
                {
                    A = loc.get(i);
                    B = loc.get(j);
                    maxDis = Location.getDistance(loc.get(i),loc.get(j));
                }
                
            }
        }
        */
        //System.out.println("PointA");
        //System.out.println(A);
        //System.out.println("PointB");
        //System.out.println(B);
        System.out.println("Distance");
        System.out.println(maxDis);
    }

}
