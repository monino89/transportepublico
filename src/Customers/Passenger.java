
package Customers;
import transportepublico.TransportService;

public class Passenger extends Person {
    private String passportNumber;
    private TransportService transportService;
    
    public Passenger(){}
    
    public Passenger(String name, int age, String passportNumber){
        super(name, age);
        this.passportNumber= passportNumber;
    }
    
    public final void setPassportNumber(String passportNumber){
        this.passportNumber=passportNumber;
    }
    
    public String getPassportNumber(){
        return this.passportNumber;
    }
    
    public void addTransportService(TransportService transportService){
        this.passportNumber.add(transportService);
    }
    
    @Override
    public String toString(){
        String str=super.toString()+"";
        return str;
    }
}
