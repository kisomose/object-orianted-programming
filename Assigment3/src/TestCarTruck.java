 /**
 *
 * @author kisomose
 */
public class TestCarTruck {
    public static void main(String[] args) {
        
        Vehicle bencar = new Car("Red",true);
        Vehicle petetruck = new Truck(" Red",true);
        
        
        System.out.println(bencar.toString());
        System.out.println(petetruck.toString());
        
        
        GarageTester g = new GarageTester();
        System.out.println("Garage Tester: "+g.getExample());
        
        Customer nc1 = new Customer("jack","Kampala");
        Customer nc2 = new Customer("Kisomose","New Jeasary");
        
        Vehicle chevroletCar = new Car("Purple",true);
        
         
        CarRentalContract cc3 = new CarRentalContract(nc2,chevroletCar);
        
        CarRental cr = new CarRental();
        cr.addContract(cc3); 
        
        System.out.println("My Contracts:");
        System.out.println(cr.displayContracts());
        
    
    }
}
