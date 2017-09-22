package pl.kodolamacz.podstawy;

public class Zmienne {

    //psvm
    public static void main(String[] args) {

        //sout
        System.out.println("Witaj");

        //zmienne
        boolean prawda = true;
        int calkowita = 15;
        double rzeczywista = 3.14;

        char znak = 'a';
        String napis = "Ala ma kota";

        //zakomentowanie ctrl + /

        //dzielimy całkowite więc wynik jest liczbą całkowitą
        System.out.println(7 / 3);

        //dzelimy rzeczywistą przez całkowitą więc nastąpi promocja typu z int do double. Dzielenie dwóch double zwraca double.
        System.out.println(7.0 / 3);

        // LUB
        System.out.println( true & false);

        // I
        System.out.println( true | false);

        //Podwójny "||" i "&&" - leniwe (jeśli pierwszy zachodzi lub nie to drugi nie jest sprawdzany)

        System.out.println( 4 ^ 2);
        System.out.println( 4 ^ 4);
        System.out.println( 4 & 4);
        System.out.println( 4 | 4);
        System.out.println( 4 & 2);
        System.out.println( 4 | 2);
        System.out.println( 1 << 2);
        System.out.println( 1 << 16);
    }
}
