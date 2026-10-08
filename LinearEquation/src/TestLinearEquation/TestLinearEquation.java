package TestLinearEquation;
import linearequation.LinearEquation;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a, b, c, d, e, f degerlerini girin: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation denklem = new LinearEquation(a, b, c, d, e, f);

        if (denklem.isSolvable()) {
            System.out.println("x: " + denklem.getX() + " y: " + denklem.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}