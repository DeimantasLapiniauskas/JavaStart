package application;

public class StandardSensor implements Sensor{
    private final int savedInt;
    public StandardSensor(int savedInt) {
        this.savedInt=savedInt;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return savedInt;
    }
}
