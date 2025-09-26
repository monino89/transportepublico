
package transportepublico;
public class TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    //CONSTRUCTORES
    
    public TransportService(){
        this.id=0;
        this.origin="";
        this.destination="";
        this.price=0;
    }
    public TransportService(int id,String origin,String destination,double price){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
    }
    
    //METODOS
    
    public final void setId(int id){
        this.id=id;
    }
    public final void setOrigin(String origin){
        this.origin=origin;
    }
    public final void setDestination(String destination){
        this.destination=destination;
    }
    public final void setPrice(double price){
        this.price=price;
    }
    public int getId(){
        return this.id;
    }
    public String getOrigin(){
        return this.origin;
    }
    public String destination(){
        return this.destination;
    }
    public double getPrice(double price){
        return this.price;
    }
    @Override
    public String toString(){
        String str="";
        return str;
    }
}
