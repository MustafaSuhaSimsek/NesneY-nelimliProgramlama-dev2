
package odevrandom;
import java.util.Random;

public class OdevRandom {

    public static void main(String[] args) {
     Random random=new Random(1000);
     int r1;
     
     System.out.println("Rastgele sayilar; ");
     for(int i=0;i<50;i++){
        r1=random.nextInt(100);
         System.out.println(r1);
     }
     
     
    }
    
}
