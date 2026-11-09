import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = scanner.nextInt();

        int wynik = 1;

        for( int i = 1; i <= n; i++){
            wynik = wynik * i;
        }
        System.out.println(n+ "! = " + wynik);
    }
}
