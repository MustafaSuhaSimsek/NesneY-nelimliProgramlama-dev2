package TestLocation;
import location.Location;
import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir ve sutun sayisini girin: ");
        int satir = input.nextInt();
        int sutun = input.nextInt();

        double[][] dizi = new double[satir][sutun];

        System.out.println("Diziyi girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = input.nextDouble();
            }
        }

        Location loc = Location.locateLargest(dizi);

        System.out.println("En buyuk eleman " + loc.maxValue + " (" + loc.row + ", " + loc.column + ") konumunda.");
    }
}