 

/**
 *
 * @author kisomose
 */
public class Garage {
    Vehicle nv = new Car("Purple",true);
    Vehicle tp = new Truck("Grey",true);


    public String setVehicle(Vehicle parked){
       return parked.toString();
       //nv.toString();          
    }
    public String toString()
    {
//overriding the toString() method  
       return "Description of the parked vehicle "+tp.toString()+nv.toString();  
    }
}
