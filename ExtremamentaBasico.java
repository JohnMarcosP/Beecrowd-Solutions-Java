import java.util.Scanner;
//Resolução de problemas do beecrowd

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.printf("X = " + soma);
        System.out.println();
    }
}
