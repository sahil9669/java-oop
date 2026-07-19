public class Numbers {

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers num=new Numbers();

        System.out.println(num.sum(4,5));
        System.out.println(num.sum(3,4,5));
        System.out.println(num.sum(3.2,7));

        // This is method overloading 
        // It comes under Static Polymorphism i.e. Compile time Polymorphism
        
    }
}
