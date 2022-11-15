package iniciante;

import java.util.Scanner;

public class Challange1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] split = entrada.split(" ");
        double a = Double.valueOf(split[0]);
        double b = Double.valueOf(split[1]);
        double c = Double.valueOf(split[2]);
        double pi = 3.14159;
        System.out.println(String.format("TRIANGULO: %.3f", (a * c) / 2));
        System.out.println(String.format("CIRCULO: %.3f", pi * (c * c)));
        System.out.println(String.format("TRAPEZIO: %.3f", ((a + b) * c) / 2));
        System.out.println(String.format("QUADRADO: %.3f", b * b));
        System.out.println(String.format("RETANGULO: %.3f", a * b));
    }
}
