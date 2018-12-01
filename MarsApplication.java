public class MarsApplication {
    public static void main(String[] args) {

        MarsRobot spirif = new MarsRobot();

        spirif.status = "eksploracja";
        spirif.speed = 2;
        spirif.temperature= -60;

        spirif.showAttribiutes();

        System.out.println("Zwiększenie prędkości do 3.");
        spirif.speed = 3;
        spirif.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        spirif.temperature = -90;
        spirif.showAttribiutes();

        System.out.println("Sprawdzenie temperatury.");
        spirif.checkTemperature();
        spirif.showAttribiutes();


    }
}
