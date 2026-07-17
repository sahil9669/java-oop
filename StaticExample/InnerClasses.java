package StaticExample;
// static class Test{} *** V.IMP ***
// static classes can not be declared outside since they are dependent on parent non-static class

class Test{
    static String name;

    public Test(String name){
        // this.name=name;
        this.name=name;
        // name is a static variable hence it is accessed with class name
    }
}

public class InnerClasses {

    static class Test2{
        String name;

        public Test2(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return name;
        }
    }


    public static void main(String[] args) {
        Test soil=new Test("Soil");
        Test sahil=new Test("Sahil");

        System.out.println(soil.name);// Test.name
        System.out.println(sahil.name);// Test.name
        // yellow underlines (Warnings): warning are bcoz we accessed them with objects instead of class name

        Test2 kunal=new Test2("Kunal");
        Test2 rev=new Test2("rev");

        System.out.println(kunal.name); // output=>kunal
        System.out.println(rev.name); // output=>rev

        System.out.println(kunal);// override toString() method
    }
}
