package iniciante;

import java.util.Scanner;

public class Challange1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double salaryByHour = scanner.nextDouble();
        double salary = hours * salaryByHour;
        String message = String.format(
                "NUMBER = %d\nSALARY = U$ %.2f", number, salary
        );
        System.out.println(message);
    }
}
