package iniciante;


import java.util.Scanner;

public class Challange1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] splited1 = line1.split(" ");
        String[] splited2 = line2.split(" ");
        String message = "VALOR A PAGAR: R$ %.2f";
        double totalValue = Integer.valueOf(splited1[1]) * Double.valueOf(splited1[2]) + Integer.valueOf(splited2[1]) * Double.valueOf(splited2[2]);
        message = String.format(message, totalValue);
        System.out.println(message);
    }
}
