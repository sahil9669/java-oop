package abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    @Override
    void normal(){
        super.normal();
    }

    // All the child classes must override the abstract methods in parent class
    @Override
    void career(){

    }

    @Override
    void partner(){

    }
}
