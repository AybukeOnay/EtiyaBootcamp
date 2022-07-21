package recapDemos;

public class FriendlyNumber {

	public void findFriendlyNumber(int number1, int number2) {
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 += i;
			}
		}
		if (total1 == number2 || total2 == number1) {
			System.out.println(number1 + " and " + number2 + ": are friendly numbers");
		} else {
			System.out.println(number1 + " and " + number2 + ": are not friendly numbers");
		}
	}

}
