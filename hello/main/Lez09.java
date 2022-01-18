public class Lez09 {
    public static void main(String[] args) {
        int myvoto = 7;
        // per essere ammesso almeno 5

        // se almeno 5
        if (myvoto >= 5) {
            System.out.println("AMMESSO!!!");
            // fascia pericolante 5-6
            if (myvoto >= 5 && myvoto <= 6) //no graffe un solo comando
               System.out.println("PERICOLANTE!!!");
        } else {
            if (myvoto >= 7 && myvoto <=8)  {
                System.out.println("DISCRETO!!!");
            } else {
                System.out.println("OTTIMO!!!");
            }
        }

    {

    }
               System.out.println("NON AMMESSO!!!");

    }
}