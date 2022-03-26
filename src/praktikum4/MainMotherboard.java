package praktikum4;

import java.util.Scanner;

class MotherBoard {
    // static nested class
    static class USB{
        int getTotalPorts(int usb2, int usb3){
            return usb2 + usb3;
        }
    }
}

public class MainMotherboard {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int usb2, usb3;
        // create an object of the static nested class
        // using the name of the outer class

        usb2 = scanner.nextInt();
        usb3 = scanner.nextInt();

        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = "+usb.getTotalPorts(usb2,usb3));

    }
}
