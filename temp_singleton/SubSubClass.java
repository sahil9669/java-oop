package singleton;

public class SubSubClass extends SubClass {
    
    public SubSubClass(int num,String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(0, null);
        int n=obj.num;
    }
}
