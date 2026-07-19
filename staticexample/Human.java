package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void msg(){
        System.out.println("Kello Morld");
        // System.out.println(this.age); -->can not use it here
    }

    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        // this.population+=1; -->  "this" keyword works but not a good practice
        Human.population+=1; 
        //-->this is correct 
        // static variables are must accessed with class name

        Human.msg();
    } 
}
