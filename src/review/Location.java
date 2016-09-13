package review;

import java.util.Random;

/**
 *
 * @author Tyler Atiburcio
 */
public class Location {
    private double x, y;
    private Random bag = new Random();

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Location()
    {
        this.x = bag.nextDouble()*100;
        this.y = bag.nextDouble()*100;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double getDistance(Location loc)
    {
        return Math.sqrt(Math.pow(this.getX()- loc.getY(), 2)+ Math.pow(this.getY()-loc.getY(), 2));
    }
    
    public static double getDistance(Location a, Location b)
    {
        try{
                if(a == null || b == null) throw new NullPointerException();
        }catch(NullPointerException e){
            System.err.println("The Location does not exist!");
            return 0;
        }
        return Math.sqrt(Math.pow(a.getX()- b.getY(), 2)+ Math.pow(a.getY()-b.getY(), 2));
    }
   
           
    

}
