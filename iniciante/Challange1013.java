package iniciante;

import java.util.Scanner;

public class Challange1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] split = entrada.split(" ");
        double a = Integer.valueOf(split[0]);
        double b = Integer.valueOf(split[1]);
        double c = Integer.valueOf(split[2]);
        //Maior AB= (a+b+abs(a-b))/2
        int maiorAB = (int) (((a + b) + Math.abs(a - b)) / 2);
        int maior = (int) (((maiorAB + c) + Math.abs(maiorAB - c)) / 2);
        System.out.println(String.format("%d eh o maior", maior));
    }
}
