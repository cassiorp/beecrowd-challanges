package iniciante;

import java.util.Scanner;

public class Challange1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma =  a + b;
        String message = String.format("SOMA = %s", soma);
        System.out.println(message);
    }
}
