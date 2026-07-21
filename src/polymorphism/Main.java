package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Shapes shape=new Shapes();
        // Circle cirlce=new Circle();
        // Square square=new Square();
        
        // shape.area();
        // cirlce.area();
        // square.area();

        Shapes circle=new Circle();
        circle.area();
        // above mentioned is method overriding
        // to override method there must be same method in parent class also.
        // it means there must be area() method in Shapes class so that it can be accesed with Shapes class refernce variable

        // why doesn't it work in below condition then?
        // because variable are compiled at compile time 
        // when you mean circle.a it takes from Shapes class itself
        System.out.println(circle.a);

        // This is called dynamic methods dispatch

        /* static methods can not be overrided */
        // The overriding depends on objects.
        // static methods does not depend on object as they are bound to classes
        // hence static mehods can not be overrided

        Shapes circle2=new Circle();
        circle2.volume(); 
        // it should be Shapes.volume();
    }
}
