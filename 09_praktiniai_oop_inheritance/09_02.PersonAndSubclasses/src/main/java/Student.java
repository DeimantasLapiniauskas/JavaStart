public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public Student(String name, String address, int credits) {
        super(name, address);
        this.credits = credits;
    }
    public String credits(){
        return "Study credits " + this.credits;
    }
    public void study(){
        credits++;
    }
}
