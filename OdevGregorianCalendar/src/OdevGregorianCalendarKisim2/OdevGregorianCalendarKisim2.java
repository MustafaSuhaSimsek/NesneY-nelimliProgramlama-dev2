
package OdevGregorianCalendarKisim2;
import java.util.GregorianCalendar;

public class OdevGregorianCalendarKisim2 {
    public static void main(String[] args) {
        GregorianCalendar g2=new GregorianCalendar();
        g2.setTimeInMillis(1234567898765L);
        int girilenyil=g2.get(GregorianCalendar.YEAR);
        int girilenay=g2.get(GregorianCalendar.MONTH);
        int girilengun=g2.get(GregorianCalendar.DAY_OF_MONTH);
        girilenay++;
        System.out.println("Girilen yil: "+girilenyil);
        System.out.println("girilen ay: "+girilenay);
        System.out.println("Girilen gun: "+girilengun);
        
    }
}
