
import java.util.Scanner;

public class Lez03 {

    public static void main(String[] args) {

        /*
         * int num1;
         * int num2;
         * 
         * Scanner lettore1 = new Scanner(System.in);
         * System.out.println("inserisci il primo numero:");
         * num1 = lettore1.nextInt();
         * 
         * Scanner lettore2 = new Scanner(System.in);
         * System.out.println("inserisci il secondo numero:");
         * num2 = lettore2.nextInt();
         * 
         * if (num1 > num2) {
         * System.out.println("il numero " + num1 + " è maggiore di " + num2);
         * }
         * 
         * else if (num1 == num2) {
         * System.out.println("il numero " + num1 + " è uguale al numero  " + num2);
         * }
         * 
         * else {
         * System.out.println("il numero " + num1 + " è minore di " + num2);
         * }
         */

        int num1;

        Scanner lettore1 = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        num1 = lettore1.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("Il numero inserito è pari");
        } else {
            System.out.println("il numero inserito è dispari");

        }

    }


































}
