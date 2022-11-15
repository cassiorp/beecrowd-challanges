package iniciante;

import java.util.Scanner;

public class Challange1009 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double salary = scanner.nextDouble();
        double salls = scanner.nextDouble();
        double commission = salls * 0.15;
        salary = salary + commission;
        String message = String.format("TOTAL = R$ %.2f", salary);
        System.out.println(message);
    }




}
