import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Define o separador decimal como ponto

        double A, B, C, media;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        media = (A * 2.0 + B * 3.0 + C * 5.0) / 10;
        System.out.printf("MEDIA = %.1f", media);
        System.out.println();

        sc.close();
    }
}
