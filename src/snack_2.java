
import java.util.Scanner;

public class snack_2 {
    public static void main(String[] args) {
        Scanner words = new Scanner (System.in);

        System.out.println("inserisci la prima parola");
        String word1 = words.nextLine();

        System.out.println("inserisci la seconda parola");
        String word2 = words.nextLine();

        if(word1.length() > word2.length()){
            System.out.println("la parola piu lunga e: " + word1);
        } else if(word1.length() < word2.length()){
            System.out.println("la parola piu lunga e: " + word2);
        } else {
            System.out.println("entrambe le parole sono lunghe uguali");
        }
    }
}
