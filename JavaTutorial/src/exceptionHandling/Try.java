package exceptionHandling;

public class Try {
    public static void main(String[] args) {
        System.out.println("Welcome to page");
        try {
            int a = 2/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
           // System.out.println("Error");
           System.out.println(e.getMessage());
        }


        System.out.println("Have a nice day");
    }

    
}
