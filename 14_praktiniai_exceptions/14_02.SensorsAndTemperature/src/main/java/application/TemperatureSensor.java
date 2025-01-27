package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean status = false;

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        status = true;
    }

    @Override
    public void setOff() {
        status = false;
    }

    @Override
    public int read() {
        if(status){
            return new Random().nextInt(61) - 30;
        }
        else throw new IllegalStateException();
    }
}
