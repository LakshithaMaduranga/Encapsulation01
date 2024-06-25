public class Encapsulation {

    private String name;
    private int age;
    private int numberOfSubjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public Encapsulation(String name, int age, int numberOfSubjects) {
        this.name = name;
        this.age = age;
        this.numberOfSubjects = numberOfSubjects;
    }
}
