package properties.inheritance;


public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        // System.out.println(box.l); --> Here I can not access box.l directly as its declared private
        System.out.println(box.h+" "+box.w);
        box.display();

        Box box2=new Box(box);
        box2.display();


        Box box3=new Box(2,3,4);
        box3.display();

        BoxWeight box4=new BoxWeight(2,3,4,5);
        System.out.println(box4.w+" "+box4.h+" "+box4.weight);
        box4.show();

        Box box5=new BoxWeight(2,3,4,5);
        // System.out.println(box5.weight);
        // --> throws error 

        // there are many varaibles in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variables 
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
        // BoxWeight box6=new Box(2,3,4);

    }
}
