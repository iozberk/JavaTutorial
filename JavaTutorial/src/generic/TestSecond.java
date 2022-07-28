package generic;

public class TestSecond<T,U>{
    T obj1;
    U obj2;

    TestSecond(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    // public T getObj(){
    //     return this.obj1;
    // }

    public void print(){
        System.out.print(obj1);
        System.out.println(obj2);
    }
}
