import java.util.Scanner;

public class Main {
 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, area, B;

        A = sc.nextDouble();
        B = A;
        area = (A * B) * 3.14159;
        System.out.printf("A=%.4f", area);
        System.out.println();
    }
 
}
