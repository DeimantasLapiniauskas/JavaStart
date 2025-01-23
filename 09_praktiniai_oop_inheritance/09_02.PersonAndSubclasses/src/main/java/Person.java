public class Person {
    private String name;
    private String address;

    public Person(){
        this.name = "Aeiou";
        this.address = "Qwerty";
    }
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n   " + address;
    }
}
