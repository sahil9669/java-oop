package introduction;

public class Student{
    int rno;
    String name;
    float marks;

    // Above are instance variables
    // The varibles that are declared inside the class and outside the method are called instance variables

    // Below is constructor.
    // Constructor is basically a specialized method which invokes automatically when object is created.
    Student(){
        this.rno=1;
        this.name="Sahil";
        this.marks=99.9f;
    }

    // we can also call constructor from another constructor with this keyword
    /* 
    Student(){
        this(0,"Default name",89);
        // this will call the constructor Student(int rno,String name,float marks)
    }
    */

    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    // the above constructor are of Student class which takes different arguments and no arguments also which is called constructor overloading


}