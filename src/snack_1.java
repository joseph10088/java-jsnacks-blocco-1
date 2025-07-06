
import java.util.Scanner;

public class snack_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);

        System.out.println("(numero 1) inserisci un numero");
        int num1 = num.nextInt();

        System.out.println("(numero 2) inserisci un numero");
        int num2 = num.nextInt();

        if(num1 > num2){
            System.out.println("il numero piu alto e: " + num1);
        } else if(num1 < num2){
            System.out.println("il numero piu alto e: " + num2);
        } else{
            System.out.println("sono uguali");
        }
    }
}
