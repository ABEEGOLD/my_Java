package AutomaticBike;

public class AutomaticBike {
    private boolean isOn;
    private int gear = 1;
    private int speed = 0;

    public boolean getIsOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int speed) {
        if (speed > 0 && speed <= 20 ){this.gear = 1;}
        if (speed > 21 && speed <= 30 ){this.gear = 2;}
        if (speed > 31 && speed <= 40 ){this.gear = 3;}
        if (speed > 40 ){this.gear = 4;}
    }

    public void turnBikeOn() {
        this.isOn = true;
    }

    public void turnBikeOff() {
            this.isOn = false;
    }

    public void accelerateBike() {
        if (isOn) {
            if (this.gear == 1)speed = speed + 1;

        }
    }


}
