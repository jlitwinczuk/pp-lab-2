import java.util.Scanner;
import java.util.Arrays;

public class master {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen z matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z fizyki? ");
        int[] fizyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z chemii? ");
        int[] chemia = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen z informatyki? ");
        int[] informatyka = new int[scanner.nextInt()];
        
        podajOceny(matematyka, scanner, "matematyki");
        podajOceny(fizyka, scanner, "fizyki");
        podajOceny(chemia, scanner, "chemii");
        podajOceny(informatyka, scanner, "informatyki");
        double suma = 0;

        int liczbaOcen = matematyka.length + fizyka.length + chemia.length + informatyka.length;
        suma += sumaOcen(matematyka);
        suma += sumaOcen(fizyka);
        suma += sumaOcen(chemia);
        suma += sumaOcen(informatyka);
        double srednia = suma / liczbaOcen;

        System.out.printf("Średnia wszystkich ocen: %.2f", srednia);

        int[] wszystkieOceny = new int[liczbaOcen];
        int index = 0;
        for (int ocena : matematyka) wszystkieOceny[index++] = ocena;
        for (int ocena : fizyka) wszystkieOceny[index++] = ocena;
        for (int ocena : chemia) wszystkieOceny[index++] = ocena;
        for (int ocena : informatyka) wszystkieOceny[index++] = ocena;

        Arrays.sort(wszystkieOceny);
        double mediana = obliczMediane(wszystkieOceny);
        System.out.printf("\nMediana ocen: %.2f", mediana);

    }



    private static void podajOceny(int[] oceny, Scanner scanner, String przedmiot) {
        int suma = 0;
        System.out.println("Podaj oceny z " + przedmiot + ":");
        for (int i = 0; i < oceny.length; i++) {
            int ocena;
            do {
                System.out.printf("Podaj ocenę nr %d z %s: ", i + 1, przedmiot);
                ocena = scanner.nextInt();
            } while (ocena < 1 || ocena > 5);
            oceny[i] = ocena;
            suma += oceny[i];
        }

        System.out.print("Lista ocen z " + przedmiot + ": ");
        for (int ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println("\nSuma ocen z " + przedmiot + ": " + suma);
        System.out.printf("Średnia ocen z %s: %.2f\n\n", przedmiot, suma / (double) oceny.length);
    }

    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }

    private static double obliczMediane(int[] tablica) {
        int mediana = tablica.length / 2;
        if (tablica.length % 2 == 0) {
            return (tablica[mediana - 1] + tablica[mediana]) / 2.0;
        } else {
            return tablica[mediana];
        }
    }
}