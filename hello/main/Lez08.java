import java.util.Scanner;

public class Lez07 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        System.out.print("inserisci il numero 1: ");

        int n1=sc.nextInt();

        System.out.print("inserisci il numero 2: ");

        int n2=sc.nextInt();

        int risultato=0;

        while (n1<=n2) {
           
            risultato = risultato + n1;

            n1 = n1 + 1;
        }
    
        System.out.println("risultato " + risultato);
    

    }
    
}

