package pl.kodolamacz.podstawy.klasy;

public class Polimorfizm {

    public static void main(String[] args) {
        Person queen = new Queen("Elisabeth", 88);
        Person ziutek = new Employee("Ziutek", 45);
        Person robert = new FootballPlayer("Robert", 28, "FC Drzewce");

//        Klasa anonimowa
        Person osoba = new Person("Anonim", 18) {
            @Override
            public void introduce() {
                System.out.println("Jestem anonim");
            }
        };

        //Nie będzie działać bo...
        //ziutek.getSalary();

        Person[] osoby = {queen, ziutek, robert, osoba};
        for (Person person : osoby) {
//            Każda osoba wie jak się przedstawić
            person.introduce();
            person.sing();
        }
    }

}
