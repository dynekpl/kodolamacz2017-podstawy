package pl.kodolamacz.podstawy.klasy;

public class Wyjatki {

    private int age;

    public Wyjatki(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new RuntimeException("Wiek nie może być ujemny");
        }
        System.out.println("Stworzono z wiekiem " + age);
    }

    public static void main(String[] args) {
        String napis = "1.23";

        double liczba = Double.parseDouble(napis);

        System.out.println(liczba);
        //System.out.println(Double.parseDouble("jeden"));

        Wyjatki wyjatki = new Wyjatki(10);
        try {
            wyjatki.setAge(5);
        } catch (NegativeAgeException e) {
            e.printStackTrace();
        }
        new Wyjatki(- 10);
    }

    private void setAge(int age) throws NegativeAgeException {
        if(age >= 0){
            this.age = age;
        }else{
            throw new NegativeAgeException();
        }
    }
}
