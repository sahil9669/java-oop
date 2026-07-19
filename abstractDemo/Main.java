package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Parent.hello();

        /* Parent obj=new Parent(); */
        // we can not create object for an abstract class unless and until we override the abstract method
        // example is below

        /*

        Parent obj = new Parent(0){

            @Override
            void career(){
            
            }

            @Override
            void partner(){

            }
        };

        */

        Son son = new Son(24);
        son.normal();

        Daughter daughter = new Daughter(18);
        daughter.normal();

        Parent obj = new Son(15);
        obj.normal();
        
    }
}
