
public class Circle extends Shapes{

    int a=20;

    static void volume(){
        System.out.println("Volume of Circle is 4*pie*r*r*r");
    }

    // this will run when object of circle is created 
    // hence it is overriding the parent  methood 
    @Override // this is called annotation
    void area(){
        System.out.println("Area of Circle is pie*r*r");
    }
}
