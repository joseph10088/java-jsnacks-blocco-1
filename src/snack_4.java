
import java.util.Scanner;

public class snack_4 {
    public static void main(String[] args) {
        String [] guests = {"giuseppe", "antonio", "mario", "alessandro", "giuanluca", "piero", "simone",};
        
        Scanner name = new Scanner (System.in); 

        System.out.println("inserisci il tuo nome");
        String nameInput = name.nextLine();

        boolean invite = false;

        for (int i = 0; i < guests.length; i++) {
            if(nameInput.toLowerCase().equals(guests[i])){
                invite = true;
                break;
            }
        }
            if(invite){
                System.out.println("sei stato invitato");
            } else {
                System.out.println("non sei stato invitato");
            }
    }
}
