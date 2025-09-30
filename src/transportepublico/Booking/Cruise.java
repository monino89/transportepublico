
package transportepublico.Booking;
public class Cruise extends TransportService{
    private String cruiseCompany;
    private String roomClass;
    
    public Cruise(){
        super();
        this.cruiseCompany="";
        this.roomClass="";
    }
    public Cruise(int id,String origin,String destination,double price,String cruiseCompany,String roomClass){
        super(id,origin,destination,price);
        this.setCruiseCompany(cruiseCompany);
        this.setRoomClass(roomClass);
    }
    
    //
    
    public void setCruiseCompany(String cruiseCompany){
        this.cruiseCompany=cruiseCompany;
    }
    public void setRoomClass(String roomClass){
        this.roomClass=roomClass;
    }
    public String getCruiseCompany(){
        return this.cruiseCompany;
    }
    public String getRoomClass(){
        return this.roomClass;
    }
    @Override
    public String toString(){
        String str=super.toString()+"\nYou are on a "+this.cruiseCompany+" cruise ship, with a "+this.roomClass+" room.";
        return str;
    }
    @Override
    public String getServiceInformation(){
        return "";
    }
    @Override
    public String getLuggageInformation(){
        return "";
    }
}
