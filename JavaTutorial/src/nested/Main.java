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

        // Anonymous a = new Anonymous();
        // a.run();   Normal

        // Anonymous override

        Anonymous a = new Anonymous(){  // Override used only in existing methods
            public void run(){
                System.out.println("Anonymous override method run");
            }
        };
        a.run();
    }
}
