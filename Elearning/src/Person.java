public class Person {
    private String name;
    private int age;
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Getter
    public int getAge() {
        return age;
    }
    // Setter
    public void setAge(int age) {
        if (age > 0) { // contrôle de validité
            this.age = age;
        }
    }
}
