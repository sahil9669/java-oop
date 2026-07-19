package singleton;

import access.A;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj=SingletonClass.getInstance();

        SingletonClass obj2=SingletonClass.getInstance();

        SingletonClass obj3=SingletonClass.getInstance();

        // all 3 reference variables are pointing to just one object
        

        /* Access Modifiers  */

        A obj1=new A(20, "Sara");
        // int n=obj1.num; ==> Error

        // we can not access protected variables in different package and which are not subclass
        // if above thing worked then what will be the difference between public and protected then

    }
}
