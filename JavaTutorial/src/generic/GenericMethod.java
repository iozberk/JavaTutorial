package generic;

public class GenericMethod {
    public <E> void GenericMethod(E[] arr) {
        for(E item: arr){
            System.out.println(item);
        }

    }
}
