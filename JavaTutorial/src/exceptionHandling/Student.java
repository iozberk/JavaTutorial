package exceptionHandling;
public class Student{

public Student find(String id) throws Exception, ArithmeticException {
    if(id.equals("123")){
        return new Student();
    }else{
        throw new StudentException("Student couldnt find");
    }
}
}