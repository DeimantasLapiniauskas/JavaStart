

public class Student implements Comparable{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object other) {
        return 0;
    }
    public int compareTo(Student other) {
        return this.getName().compareTo(other.getName());
    }
}
