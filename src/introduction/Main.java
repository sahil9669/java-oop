package introduction;

public class Main{
    public static void main(String[] args) {
        Student student=new Student();
        // Student student happens at compile time
        // new Student() happens at run time
        // new keyword dynamically allocates memory and returns a reference to it

        Student one =new Student();
        Student two=one;

        one.name="Name in Object one";
        System.out.println(two.name);

        // The output name was similar to object one name
        // its because two reference variables are referencing to same object  
        // so change in one makes change in other

        // The output is "Name in Object one" because both reference variables
        // (one and two) point to the same Student object.
        // No new object is created when we write:
        // Student two = one;
        // Therefore, any changes made through one are also visible through two.

        Student Sahil=new Student();
        Sahil =new Student(2,"a",89);

        // what we do above is reassigning 
        // first the Sahil was pointing to object Student() =====> Sahil---->Student()
        // then we change the refernce, now Sahil is pointing to Student(two) ====> Sahil---->Student(two)
        // now the object student() has no reference so it will be removed by garbage collector


        /* final keyword */

        // final int a; --> throws an error
        // final variables must be initialsed
        // we can not change variables which are declared final

        final int a =10;
        // a=20; --->Throws Error
        System.out.println(a);

        final Student kunal=new Student();
        // kunal=new Student(7,"Patya",90);

        // because we have declared final to kunal we can not reassign it 
        // but we can do

        kunal.rno=89;
        kunal.name="jajids";


    }
}