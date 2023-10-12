public class Person {
     String name;
     String birth;

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBirth: " + birth;
    }
}