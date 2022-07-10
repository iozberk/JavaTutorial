
public class StringClass {
	public static void main(String[] args) {
		
		// Ref --->> https://www.w3schools.com/java/java_ref_string.asp
		
		// str.length()
		// str.concat(str2)
		// str.indexOf("a")
		// str.charAt(5)
		// str.contains("a")
		// str.endsWith("a")
		// str.replace("a", "e")		
		// str.toLowerCase() -- // str.toUpperCase()
		
		String greeting = "Hello";
		String greeting1 = "World";
	    System.out.println(greeting);                                   // Hello
	    System.out.println(greeting1);                                  // World
	    System.out.println(greeting.length());                          // 5 
	    System.out.println(greeting.concat(greeting1));                 // HelloWorld
	    System.out.println(greeting.indexOf("e"));                      // 1
	    System.out.println(greeting.charAt(3));                         // l
	    System.out.println(greeting.contains("a"));                     // false
	    System.out.println(greeting.endsWith("o"));                     // true
	    System.out.println(greeting.startsWith("h"));                   // false
	    System.out.println(greeting.replace("e", "a"));                 // Hallo
	    System.out.println(greeting.toLowerCase());                     // hello
	    System.out.println(greeting.toUpperCase());                     // HELLO
	}
}
