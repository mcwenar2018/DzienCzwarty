//plik 2

public class WashingMachine {
    private int temperature;
    private int spinning;

    private int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private int getSpinning() {
        return spinning;
    }

    private void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    void modeForSensitiveClothes(){
        temperature = 30;
        spinning = 800;
    }

    void modeForTowels(){
        temperature = 90;
        spinning = 1200;
    }

    void showSettings(){
        System.out.println("temp:" + getTemperature() + ", obroty: " + getSpinning());
    }
}
