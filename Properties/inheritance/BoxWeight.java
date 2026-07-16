package Properties.inheritance;

public class BoxWeight extends Box {
    public double weight;
    
    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);// what is this? call the parent class constructor
        // used to initialise values present in parent class
        // System.out.println(super.w); used to access parent class variables
        this.weight=weight;
    }

    void show(){
        super.display();
    }
}
