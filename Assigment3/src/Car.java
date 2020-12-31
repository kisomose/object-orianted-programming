 

/**
 *
 * @author kisomose
 */
public class Car extends Vehicle {
    boolean hasWinterTires = false;
    
    Car(String carcolor,boolean hasWint){
        
        this.color = carcolor;
        hasWinterTires = hasWint;
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" Has Winter Tires "+hasWinterTires;
    }   
    
}
