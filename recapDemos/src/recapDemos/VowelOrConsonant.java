package recapDemos;

public class VowelOrConsonant {

	public void isVowelOrConsonant(char character) {

		switch (character) {
		case 'a':
		case 'u':
		case 'o':
		case 'ı':
			System.out.println("Character is vovel");
			break;
		default:
			System.out.println("Character is not vovel");
		}
	}
}
