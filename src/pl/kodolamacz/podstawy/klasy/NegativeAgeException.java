package pl.kodolamacz.podstawy.klasy;

public class NegativeAgeException extends Exception{

    public NegativeAgeException() {
        System.out.println("Wiek nie może być ujemny");
    }
}
