package iniciante;

import java.util.Scanner;

public class Challange1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = a * b;
        String message = String.format("PROD = %s", prod);
        System.out.println(message);
    }
}
