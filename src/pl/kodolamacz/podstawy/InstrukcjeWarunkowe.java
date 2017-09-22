package pl.kodolamacz.podstawy;

public class InstrukcjeWarunkowe {

    public static void main(String[] args) {
//        if
        int temperatura = 22;
        if (temperatura > 30) {
            System.out.println("Upał!");
        } else if (temperatura > 20) {
            System.out.println("Jest ciepło");
        } else if (temperatura > 10) {
            System.out.println("Jest chłodno");
        } else {
            System.out.println("Zimno!");
        }

        char znak = 'a';
        switch (znak){
            case 'a':
                System.out.println("Mamy a");
                break;
            case 'b':
                System.out.println("Mamy b");
                break;
            default:
                System.out.println("Nie wiem co to!!!");
        }

        int fundusz = 5000;
    }
}
