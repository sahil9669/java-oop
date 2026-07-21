package polymorphism;

public class Shapes{

    int a=10;

    // if below we declare the method "final" it will not be overrided

    /* THIS IS KNOWN AS EARLY BINDING */

    // final void area(){
    //     System.out.println("Shapes");
    // }

    static void volume(){
        System.out.println("Volume of Shapes");
    }

    void area(){
        System.out.println("Area of Shapes");
    }
}