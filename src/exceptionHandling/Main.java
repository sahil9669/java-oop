package exceptionHandling;

public  class Main{
    public static void main(String[] args) {
        int a=5;
        int b=0;
        // int c=a/b; --> ArithmeticException (divide by zero not possible)

        try{
            // int c=a/b;
            // divide(a,b);
            String name="Sahil";

            if(name.equals("Sahil")){
                throw new MyException("name is sahil");
            }
            
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());

        } catch(Exception e){
            System.out.println("normal exception");

            // we can not write this catch block before ArithmeticException catch block 
            // bcoz exception class is parent class of ArithmeticException class
            // the Exception block will run everytime the exception is being caught 
            // the code will never reach the catch block below it

        } finally{
            System.out.println("Finally block will execute everytime");
            // we can not write more than one finally blocks
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero exception");
        }
        return a/b;
    }
}