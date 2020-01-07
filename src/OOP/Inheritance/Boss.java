package OOP.Inheritance;

public class Boss extends Person {

    public Boss() {
        super.setSalary(super.getSalary() + 10000);
    }
}
