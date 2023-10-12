public class Employee extends Person {
    double salary;

    public Employee(String name, String birth, double salary) {
        super(name, birth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }
}