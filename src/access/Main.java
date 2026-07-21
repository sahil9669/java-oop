package access;

import singleton.SubSubClass;

public class Main{
    public static void main(String[] args) {
        A obj = new A(10,"Sahil");
        int n=obj.num;

        SubClass obj2=new SubClass(20, "XYZ");
        int n1=obj2.num;

        
    }
}