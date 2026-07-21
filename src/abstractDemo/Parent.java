package abstractDemo;

// Any class that contains one or more abstract methods also be declared as abstract


public abstract class Parent {
    int age;
    final int Value;

    public Parent(int age){
        this.age=age;
        this.Value=47;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("this is normal method");
    }

    abstract void career();
    abstract void partner();
}
