 
/**
 *
 * @author kisomose
 */
public class CarRentalContract {
    Customer c ;
    Vehicle v ;
     
    
    CarRentalContract(Customer custo , Vehicle vim)
    {
        c = custo;
        v = vim;
    }
    
    
    static int carObjects = 0; 
    { 
        carObjects += 1; 
    }
    public String toString(){
        
        return c.name+" : "+ v.toString();
    }
}
