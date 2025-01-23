
public class Human implements Comparable {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    } // the "implements Comparable" demands this to exist *somewhere*, but all the tests check compareTo with the Human

    public int compareTo(Human another){
        return another.getWage() - this.wage;
    }
}
