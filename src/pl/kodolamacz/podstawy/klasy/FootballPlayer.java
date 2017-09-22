package pl.kodolamacz.podstawy.klasy;

public class FootballPlayer extends Person {

    private String club;

    public FootballPlayer(String name, int age, String club) {
        super(name, age);
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    @Override
    public void introduce() {
        System.out.println("Jestem piłkarzem " + getName() + " i gram w klubie " + getClub());
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println("Ale spróbuję: sto lat, sto lat !!!");
    }
}
