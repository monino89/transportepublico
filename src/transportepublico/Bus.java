
package transportepublico;
public class Bus extends TransportService{
    private String busCompany;
    private String boardingPoint;
    
    //CONSTRUCTORES
    
    public Bus(){
        super();
        this.busCompany="";
        this.boardingPoint="";
    }
    public Bus(int id,String origin,String destination,double price,String busCompany,String boardingPoint){
        super(id,origin,destination,price);
        this.setBusCompany(busCompany);
        this.setBoardingPoint(boardingPoint);
    }
    
    //METODOS
    
    public final void setBusCompany(String busCompany){
        this.busCompany=busCompany;
    }
    public final void setBoardingPoint(String boardingPoint){
        this.boardingPoint=boardingPoint;
    }
    public String getBusCompany(){
        return this.busCompany;
    }
    public String getBoardingPoint(){
        return this.boardingPoint;
    }
    @Override
    public String toString(){
        super.toString();
        String str="\nYou boarded the following bus company's bus: "+this.busCompany+" at "+this.boardingPoint;
        return str;
    }
    @Override
    //nse q hacen estos
    public String getServiceInformation(){
        return "";
    }
    @Override
    public String getLuggageInformation(){
        return "";
    }
    
}
