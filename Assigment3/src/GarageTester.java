 
/**
 *
 * @author kisomose
 */
public class GarageTester {
    public String getExample(){
        Truck hod = new Truck("Black", false);
        Garage g = new Garage();
        return g.setVehicle(hod);
    }
}
