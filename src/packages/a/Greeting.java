package packages.a;
import static packages.b.Message.message;
import packages.b.Show;

public class Greeting{
    public static void main(String[] args) {
        System.out.println("Hello from a");
        message(); // static methods does not depend on object

        // the reason we created object for Show class is  bcoz show() method is non-static 
        Show obj=new Show();
        obj.show();
    }
}
