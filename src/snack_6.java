
import java.util.Scanner;

public class snack_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int numInput = num.nextInt();

        for (int i = 0; i < numInput; i++) {
            int cube = (int) Math.pow(i,3);
            System.out.println(cube);
        }
    }
}
