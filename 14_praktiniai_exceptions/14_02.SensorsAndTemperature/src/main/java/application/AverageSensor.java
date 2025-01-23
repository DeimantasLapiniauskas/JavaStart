package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors = new ArrayList<>();
    private final List<Integer> reads = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return reads;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) throw new IllegalStateException();
        int result = (int) sensors.stream().mapToDouble(Sensor::read).average().orElse(-1);
        reads.add(result);
        return result;
    }
}
