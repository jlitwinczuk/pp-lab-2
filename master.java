import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę z matematyki:");
        double matematyka = scanner.nextDouble();

        System.out.println("Podaj ocenę z fizyki:");
        double fizyka = scanner.nextDouble();

        System.out.println("Podaj ocenę z chemii:");
        double chemia = scanner.nextDouble();

        System.out.println("Podaj ocenę z informatyki:");
        double informatyka = scanner.nextDouble();

        double srednia = (matematyka + fizyka + chemia + informatyka) / 4.0;
        System.out.println("Średnia ocen z przedmiotów: " + srednia);
    }
}