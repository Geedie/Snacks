package Practice;

public class Bike {

    private boolean isOn;
    private int speed;
    private int gear;
    private int currentSpeed;
    private int currentGear = 1;

    public Bike(boolean isOn, int speed, int gear){
        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }


    public int getCurrentSpeed() {
        return currentSpeed;

    }

    public void accelerate() {
        if(currentSpeed >=40){
            currentGear = 4;
            currentSpeed += 4;
        }
        if(currentSpeed >= 31 && currentSpeed <=40){
            currentGear = 3;
            currentSpeed += 3;
        }
        if(currentSpeed >= 21 && currentSpeed <= 30) {
            currentGear = 2;
            currentSpeed += 2;
        }
        if(currentSpeed >=0 && currentSpeed<= 20){
            currentSpeed = currentSpeed + 1;
        }

    }

    public int getCurrentGear() {
        return currentGear;
    }


}
