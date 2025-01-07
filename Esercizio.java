import java.util.Scanner;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, n;

        do {
            System.out.println("Inserire dimensione del vettore: ");
            n = input.nextInt();
        } while (n < 0);
        double[] carlone = new double[n];

        for (i = 0; i <= n - 1; i++) {
            System.out.println("Inserire il valore della " + (i + 1) + " cella del vettore: ");
            carlone[i] = input.nextDouble();
        }
        for (i = 0; i <= n - 2; i++) {
            for (j = 0; j <= n - 1; j++) {
                if (carlone[i] == carlone[j]) {
                    System.out.println("Il valore " + carlone[i] + " occorre nelle posizioni " + (i + 1) + " e " + (j + 1) + ". E stato inserito 2 volte");
                }
            }
        }
    }
}
