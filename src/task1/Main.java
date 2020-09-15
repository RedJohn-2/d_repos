package task1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r1 = ");
        double r1 = scanner.nextDouble();
        System.out.print("Enter R2 = ");
        double R2 = scanner.nextDouble();
        System.out.println(calcSector1(r1) + calcSector2(r1, R2) + calcSquare(R2));
    }


    static double calcSector1(double r1) {
        return Math.PI*r1*r1/2;
    }

    static double calcSector2(double r1, double R2) {
        return 3*(R2*R2*Math.PI-r1*r1*Math.PI)/8;
    }

    static double calcSquare(double R2) {
        return (4*R2*R2-R2*R2*Math.PI)/4;
    }

}