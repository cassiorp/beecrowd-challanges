package iniciante;

import java.util.Scanner;

public class Challange1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int dif = a * b - c * d;
        System.out.println(String.format("DIFERENCA = %d", dif));
    }
}
