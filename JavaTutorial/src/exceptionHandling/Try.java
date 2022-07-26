package exceptionHandling;

public class Try {
    public static void main(String[] args) {
        System.out.println("Welcome to page");
        try {
            System.out.println("Try sysout test");
            int a = 2/0; // Error line
            System.out.println(a);
            System.out.println("The try block will not run when an error occurs. Note: lines after error");
        //} catch (ArithmeticException e) {
        } catch (Exception e) {
           // System.out.println("Error");
           //System.out.println(e.getMessage());
           System.out.println(e.toString()); 
        }finally{
            System.out.println("Finally worked");
        }


        System.out.println("Have a nice day");
    }
 
    
}
