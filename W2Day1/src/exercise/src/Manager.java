public class Manager extends Employee {
    Employee assistant;

    public Manager(String name, String birth, double salary, Employee assistant) {
        super(name, birth, salary);
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAssistant:\n" + assistant.toString();
    }
}