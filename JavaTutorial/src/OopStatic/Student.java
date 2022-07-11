package OopStatic;

public class Student {
	public String name;
	public int id, grade;
	private static int counter = 0;
	
	Student(String name, int id, int grade){
		this.name = name;
		this.id = id;
		this.grade = grade;
		Student.counter++;
	}
	public void exit() {
		Student.counter--;
	}
	public static int studentCount() {
		return Student.counter;
	}
	
	public static double calculateMean(int[] arr) {
		double overall = 0;
		for(int i = 0; i < arr.length; i++) {
			overall += arr[i];
		}
		return overall/arr.length;
	}
}
