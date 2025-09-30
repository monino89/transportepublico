//main
package transportepublico;
import Customers.Passenger;
import transportepublico.Booking.Cruise;
public class Transportepublico {
    public static void main(String[] args) {
      Passenger passenger1=new Passenger("david",16,"8989");
      Cruise cruise1=new Cruise(7890,"colombia","us",45000.00,"crucerocolombia","deluxe");
      passenger1.addTransportService(cruise1);
        System.out.println(passenger1.toString());
    }
}
