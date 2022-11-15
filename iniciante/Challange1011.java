package iniciante;

import java.util.Scanner;

public class Challange1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double result = (4/3.0) * pi * (raio * raio * raio);
        String message = String.format("VOLUME = %.3f", result);
        System.out.println(message);
    }



}
