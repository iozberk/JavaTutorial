
public class PalindromeWord {

	public static void main(String[] args) {
		// https://en.wikipedia.org/wiki/Palindrome EX: TENET, ANNA, HANNAH, KAYAK, REFER etc...
		String str = "TENET", temp = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
			// System.out.print(str.charAt(i) + " ");
		}
		if(temp.equals(str)) {
			System.out.println(str + " is " + "Palindrome Word");
		}else {
			System.out.println(str + " is NOT " + "Palindrome Word");
		}
	}

}
