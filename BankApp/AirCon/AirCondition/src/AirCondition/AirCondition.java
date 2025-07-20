package AirCondition;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;



    public AirCondition() {
        this.isOn = false;
    }
    public void AcisOn(){
        this.isOn = true;
    }
    public void AcisOff(){
        this.isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }
    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;

    }

    public void IncreaseTemp(){
        if(isOn && temperature <30){
            this.temperature = temperature + 1;
        }


    }
    public void DecreaseTemp() {
        if(isOn && temperature > 16){
            this.temperature = temperature - 1;
        }

    }

}
