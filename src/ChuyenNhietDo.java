import java.util.Scanner;

public class ChuyenNhietDo {
    public static double chuyenDoCSangDoF(double doC) {
        double doF = (9.0 / 5) * (doC + 32);
        return doF;
    }

    public static double chuyenDoFSangDoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    doF = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + chuyenDoFSangDoC(doF));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    doC = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + chuyenDoCSangDoF(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }
}
