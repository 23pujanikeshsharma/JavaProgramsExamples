package demo.java;

public class ASCIIValueExample {

	public static void main(String[] args) {

		String s = "My 675687Name Is Puja hjg78957Kumari";

		char chArr[] = s.toCharArray();

		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 48 && chArr[i] <= 57) {
				System.out.print(chArr[i]);
			}
		}
		System.out.println();

		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 65 && chArr[i] <= 90 || chArr[i] >= 97 && chArr[i] <= 122) {
				System.out.print(chArr[i]);
			}
		}

	}

}

// 48 to 57
// a to z : 65 to 90
// A to Z : 97 to 122
