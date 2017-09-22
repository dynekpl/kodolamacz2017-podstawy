package pl.kodolamacz.podstawy.klasy;

public abstract class Person {

    protected String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void introduce();

    public void sing(){
        System.out.println("Nie umiem");
    }

}
