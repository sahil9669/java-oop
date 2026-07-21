package properties.inheritance;

public class Box {
    private double l;
    double h;
    double w;

    Box(){
        super(); 
        // We know from our implementation there is no class above Box class
        // But still we can use here super() 
        // It's bcoz this super() will call the constructor of Object class
        // And Object Class is  Super Class of every other class
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //cube 

    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public void display(){
        System.out.println(this.l+" "+this.h+" "+this.w);
    }

}
