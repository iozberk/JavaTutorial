
public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int toplam = a + b;
		int cikarma = a - b;
		int carpma = a * b;
		int bolme = a / b;
		
		System.out.println("Toplama: " + toplam);
		System.out.println("Cikarma: " + cikarma);
		System.out.println("Carpma: " + carpma);
		System.out.println("Bolme: " + bolme);
		
		int mod = a % b;
		System.out.println("A mod b : " + mod);
		toplam++;
		System.out.println(toplam);
		cikarma--;
		System.out.println(cikarma);
		
		System.out.println("------------");
		System.out.println("== operatoru -->> " + (a == b));
		System.out.println("!= operatoru -->> " + (a != b));
		System.out.println("> operatoru -->> " + (a > b));
		System.out.println("< operatoru -->> " + (a < b));
		System.out.println(">= operatoru -->> " + (a >= b));
		System.out.println("<= operatoru -->> " + (a <= b));
		
		
		System.out.println("----------------------");
		int number1 = 12;
		System.out.println(number1);
		number1 += 3;
		System.out.println(number1);
		}

}
