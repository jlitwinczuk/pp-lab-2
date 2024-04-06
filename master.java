import java.util.Scanner;

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
    }
    
    private static void podajOceny(int[] oceny, Scanner scanner, String przedmiot) {
        for (int i = 0; i < oceny.length; i++) {
            System.out.printf("Podaj ocenę nr %d z %s: ", i + 1, przedmiot);
            oceny[i] = scanner.nextInt();
        }
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}