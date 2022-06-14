package iniciante;


import java.util.Scanner;

public class Challange1005 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}
