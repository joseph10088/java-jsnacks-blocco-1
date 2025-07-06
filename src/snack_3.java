
import java.util.Scanner;

public class snack_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("inserisci un numeto");
            int numInput = num.nextInt();
            sum += numInput;
        }
        System.out.println("la somma di tutti i numeri è: " + sum);
    }
}
