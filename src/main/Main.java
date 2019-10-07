package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = Integer.parseInt(s.nextLine());
        LEDStrip obj = new LEDStrip(n);
        for (int i = 0; i < n; i++) {
            String colour = s.next();
            boolean con = s.nextBoolean();
            obj.getLEDArray()[i] = new LED(colour, con);

        }
        obj.showStripStatus();
    }
}
