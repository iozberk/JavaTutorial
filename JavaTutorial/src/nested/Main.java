package nested;

public class Main {
    public static void main(String[] args) {
        // Nested class
        // Inner class
        //     static
        //     non-static
        // Local class 
        // Anonymous class

        NonStatic non = new NonStatic();
        NonStatic.Inner inner = non.new Inner();
        // inner.run();


        Static.Inner s = new Static.Inner();
        s.run();

        System.out.println("////////////////////");
        Local l = new Local();
        l.run();
    }
}
