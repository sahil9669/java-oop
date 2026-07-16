package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj=SingletonClass.getInstance();

        SingletonClass obj2=SingletonClass.getInstance();

        SingletonClass obj3=SingletonClass.getInstance();

        // all 3 reference variables are pointing to just one object

    }
}
