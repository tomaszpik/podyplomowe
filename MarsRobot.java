public class MarsRobot {//implements Robot{
    String status;
    int speed;
    float temperature;
    int opportunity;


    void checkTemperature(){
        if (temperature <-80){
            status = "powrót do domu";
            speed = 5;
        }
    }
    void showAttribiutes(){
        System.out.println("Status:"+ status);
        System.out.println("Prędkosc:" + speed);
        System.out.println("Temperatura:" + temperature);
    }


    public void checkStatus() {

    }
}
