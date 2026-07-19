package interfaces;

public class Car implements Engine,Brake {

    @Override
    public void brake() {
        System.out.println("brake the car");
    }

    @Override
    public void start() {
        System.out.println("start the car");
        
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void acc() {
        System.out.println("acclerator the car");
    }
    
}
