public class JavaCharToString {
	public static void main(String[] args) {
		char c = 'X';
		String str = String.valueOf(c);
		String str1 = Character.toString(c);
		System.out.println(c  + str);
		System.out.println(c + str1);
	}
}