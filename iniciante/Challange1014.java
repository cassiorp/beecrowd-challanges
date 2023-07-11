package iniciante;

import java.util.Scanner;

public class Challange1014 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalKm = scanner.nextInt();
    double totalListrosGastos = scanner.nextDouble();
    String result = "%.3f km/l";
    System.out.println(String.format(result, totalKm / totalListrosGastos));
  }

}
