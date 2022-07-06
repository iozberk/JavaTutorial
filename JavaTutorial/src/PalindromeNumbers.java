public class PalindromeNumbers {

	static boolean isPalindrome(int input) {
		int temp, reflecnum = 0, remainder;
		
		temp = input;
		while(temp != 0) {
			remainder = temp % 10;
			reflecnum = reflecnum * 10 + remainder;
			temp /= 10;
			
		}
		
		if(input == reflecnum) {
			return true;
		}else {
			return false;
		}
				
	}
	
	public static void main(String[] args) {
		// Palindrome 123 321 | reflectional symmetry
		System.out.println(isPalindrome(121));
	}

}
