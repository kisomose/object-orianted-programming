 

/**
 *
 * @author kisomose
 */
public class Truck extends Vehicle {
     boolean hasTrailer = false;
    
    Truck(String TruckColor,boolean hasTrail){
        this.color = TruckColor;
        hasTrailer = hasTrail;
    }

    Truck() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        
        return "The Vehicle is:"+getColor(color)+" has Trailer: "+hasTrailer;
    }
}
