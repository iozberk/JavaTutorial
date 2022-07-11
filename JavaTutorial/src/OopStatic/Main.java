package OopStatic;

public class Main {

	public static void main(String[] args) {
		System.out.println("Students " + Student.studentCount());
		Student student1 = new Student("John", 1, 100);
		System.out.println("Students " + Student.studentCount());
		Student student2 = new Student("Jennifer", 2, 50);
		System.out.println("Students " + Student.studentCount());
		Student student3 = new Student("Nancy", 3, 80);
		System.out.println("Students " + Student.studentCount());
		student1.exit();
		System.out.println("Students: " + Student.studentCount());
		
		
		int[] grades = new int[3];
		grades[0] = student1.grade;
		grades[1] = student2.grade;
		grades[2] = student3.grade;
		
		double grad = Student.calculateMean(grades);
		System.out.println(grad);
	}

}
