
package OdevGregorianCalendarKisim1;
import java.util.GregorianCalendar;



public class OdevGregorianCalendarKisim1 {

    
    public static void main(String[] args) {
        GregorianCalendar g1=new GregorianCalendar();
        
        int yil=g1.get(GregorianCalendar.YEAR);
        int ay=g1.get(GregorianCalendar.MONTH);
        ay++;
        int gun=g1.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Guncel yil: "+yil);
        System.out.println("Guncel ay: "+ay);
        System.out.println("Guncel gun: "+gun);
        
        
    }
    
}
