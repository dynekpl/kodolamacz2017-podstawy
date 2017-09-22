package pl.kodolamacz.podstawy.klasy;

public class Queen extends Person {
    public Queen(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem królowa " + getName());
    }

    @Override
    public void sing() {
        System.out.println("Królowej nie wypada śpiewać");
    }

    public static void main(String[] args) {
        Queen elisabeth = new Queen("Elisabeth II", 88);
        elisabeth.introduce();
    }
}
