
package transportepublico;
public class Train extends TransportService{
    private String seatType;
    private int wagonNumber;
    
    //CONSTRUCTORES
    
    public Train(){
        super();
        this.seatType="";
        this.wagonNumber=0;
    }
    public Train(int id,String origin,String destination,double price,String seatType,int wagonNumber){
        super(id,origin,destination,price);
        this.setSeatType(seatType);
        this.setWagonNumber(wagonNumber);
    }
    
    //METODOS
    
    public final void setSeatType(String seatType){
        this.seatType=seatType;
    }
    public final void setWagonNumber(int wagonNumber){
        this.wagonNumber=wagonNumber;
    }
    public String getSeatType(){
        return this.seatType;
    }
    public int getWagonNumber(){
        return this.wagonNumber;
    }
    @Override
    public String toString(){
        super.toString();
        String str="\nYour seat type is: "+this.seatType+" located on wagon "+this.wagonNumber;
        return str;
    }
    @Override
    //nse que hacen estas
    public String getServiceInformation(){
        return "";
    }
    @Override
    public String getLuggageInformation(){
        return "";
    }
}
