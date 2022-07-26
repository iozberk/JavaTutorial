package nested;

public class Local {
    public void run(){
        class NewLocalClass{
            int a;
            NewLocalClass(int a){
                this.a = a;

            }
            public void print(){
                System.out.println(a);
            }
        }

        NewLocalClass newLocal = new NewLocalClass(12);
        newLocal.print();
    }
}
