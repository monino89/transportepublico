
package transportepublico.Booking;

import transportepublico.Booking.TransportService;

public class Flight extends TransportService{
    private String airline;
    private String seatClass;
    
    //CONSTRUCTORES
    
    public Flight(){
        this.airline="";
        this.seatClass="";
    }
    public Flight(int id,String origin,String destination,double price,String airline,String seatClass){
        super(id,origin,destination,price);
        this.setAirline(airline);
        this.setSeatClass(seatClass);
    }
    
    //METODOS
    
    public final void setAirline(String airline){
        this.airline=airline;
    }
    public final void setSeatClass(String seatClass){
        this.seatClass=seatClass;
    }
    public String getAirline(){
        return this.airline;
    }
    public String getSeatClass(){
        return this.airline;
    }
    @Override
    public String toString(){
        String str=super.toString()+"You will be flying with "+this.airline+" in seat class "+this.seatClass;
        return str;
    }
    @Override
    //que hacen las abstract?????????
    public String getServiceInformation(){
        return "";
    }
    @Override
    public String getLuggageInformation(){
        return "";
    }
}
