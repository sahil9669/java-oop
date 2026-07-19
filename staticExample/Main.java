package staticExample;

public class Main {
    public static void main(String[] args) {
        // Human sahil=new Human(23,"Sahil",5000000,false);
        // Human kunal=new Human(24,"Kunal",7000000,true);
        // Human Gana=new Human(23,"Gana",9000000,false);
        
        System.out.println(Human.population);
        // static variables do not depend on object hence we can access them with class name and even before object is created

        // greeting(); 
        // -->can not access non_static methods inside static method
        // we know something which is non-static belong to an object


        fun();

        Main obj=new Main();
        obj.fun2();
        // for above we have fun2() method which is non-static 
        // inside it there is  non-static method message()
        // when we create object for outer method we do not need to create object for inside methods 
        // the object of outer method will take care of it
        obj.message();

        
    }

    static void fun(){
        // greeting();-->throws error
        // you cant use this bcoz it requires an instance
        // fun() function is declared  static so it does not require any instance
        // above is the reason we cant use it

        Main obj=new Main();
        obj.greeting();
        // this is accessible bcoz we have created an instance now

    }

    void fun2(){
        message();
    }

    void message(){
        System.out.println("Hello Non-static Message");
    }

    void greeting(){
        System.out.println("Hello Non_Static greeting");
        // fun(); --> we can access static inside non-static methods
    }
}
