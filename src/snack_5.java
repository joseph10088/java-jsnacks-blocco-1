
import java.util.Scanner;

public class snack_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("inserisci un numero");
            int numInput = num.nextInt();

            if(numInput % 2 != 0){
                System.out.println("il numero : " + numInput + " e dispari");
            }
        }
    }
}
