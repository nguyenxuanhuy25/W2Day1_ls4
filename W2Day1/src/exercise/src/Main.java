import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nguyễn Xuân Huy", "25/05/2003");
        Employee employee = new Employee("Phạm Văn Huy", "26/6/2004", 50000.0);
        Employee assistant = new Employee("Lê Phạm Anh Huy", "27/7/2005", 30000.0);
        Manager manager = new Manager("Boss", "20/02/2000", 80000.0, assistant);


        System.out.println("Person:\n" + person.toString());
        System.out.println("\nEmployee:\n" + employee.toString());
        System.out.println("\nManager:\n" + manager.toString());
    }
}