package aa;

public class DemoString {

	public static void main(String[] args) {

		String s = "Arun kumar";
		char[] ch = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
