package staticExample;

public class StaticBlock {
    static int a=4;
    static int b;

    static{
        System.out.println("static Block Run");
        b=a*5;
    }

    // When the object is created it will automatically invoke static-block
    // static only run once during whole program execution
    // that means it will only execute after first object creation
    // After that it will not run for any other object

    public static void main(String[] args) {

        System.out.println(StaticBlock.a);

        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        // We need to create object to run static block so that it can initialise variable b in above program

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}
