public class snack_9 {
    public static void main(String[] args) {

        int somma = 0;

        double totale = 0;
        
        for (int i = 1; i <= 10; i++) {
            somma += i;
        }

        totale = (double) somma / 10;
        System.out.println(totale);
    }
}
