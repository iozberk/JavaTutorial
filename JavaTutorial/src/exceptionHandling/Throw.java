package exceptionHandling;

public class Throw {
    public static void main(String[] args) {
        int a = 0;
        if(a == 0){
            System.out.println("The divisor cannot be 0");
            throw new ArithmeticException("Exception Messaage!!!");
        }
        System.out.println("Code");
    }
}
