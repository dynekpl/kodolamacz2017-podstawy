package pl.kodolamacz.podstawy.klasy;

public class Employee extends Person{

    private int salary;

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Ten pracownik nazywa się: " + this.getName() + " i ma " + this.getAge() + "lat");
    }

    @Override
    public void sing() {
        System.out.println("La la la...");
    }

    public static void main(String[] args) {
        Employee mietek = new Employee("Mietek", 40);
        mietek.introduce();
        Employee ziutek = new Employee("Ziutek", 45);
        ziutek.introduce();
    }
}
