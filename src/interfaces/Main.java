package interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();

        // car.acc();
        // car.brake();
        // car.start();

        // Engine obj=new ElectricEngine();

        // NiceCar car = new NiceCar(obj);
        // car.acc();

        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
