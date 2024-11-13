import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, prod;

        A = sc.nextDouble();
        B = sc.nextDouble();
        prod = A*B;
        System.out.printf("PROD = "+ prod);
        System.out.println();
    }
}
