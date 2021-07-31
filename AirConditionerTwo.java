package Practice;

public class AirConditionerTwo {

    private boolean on;
    private int temperature = 16;

    public boolean isOn() {

        return on;

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseTemp() {
        if(temperature < 30) {
            temperature = temperature + 1;
        }
    }

    public int getTemp() {
        return temperature;

    }

    public void decreaseTemp() {
        if(temperature > 16) {
            temperature = temperature - 1;
        }
    }


}