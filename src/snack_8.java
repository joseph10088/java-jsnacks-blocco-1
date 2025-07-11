
import java.util.Scanner;

public class snack_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci un numero di 4 cifre");
        int num = scan.nextInt();

        String numUtente = String.valueOf(num);

        int somma = 0;

        for(int i = 0; i < numUtente.length(); i++){
            char numeroScomponi = numUtente.charAt(i);

            int numeroScomposto = Character.getNumericValue(numeroScomponi);

            somma += numeroScomposto;
        }

        System.out.println(somma);
    }
}
