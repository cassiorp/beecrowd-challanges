package iniciante;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Challange1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);
        BigDecimal bigDecimal = new BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN);
        String message = String.format("A=%s", bigDecimal);
        System.out.println(message);
    }
}
