package OOP.Inheritance;

public class RunInheritance {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Secretary sec = new Secretary();
        Boss boss = new Boss();

        System.out.println(emp.getSalary());
        System.out.println(sec.getSalary());
        System.out.println(boss.getSalary());
    }
}
