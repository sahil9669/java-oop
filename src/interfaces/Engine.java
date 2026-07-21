package interfaces;

public interface Engine {

    // static final int PRICE=8000;
    // both are same 
    // bcoz in interfaces variables are by default static and final
    
    int PRICE=8000;

    void start();
    void stop();
    void acc();
}
