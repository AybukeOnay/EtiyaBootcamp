package recapDemos;

public class PrimeNumber {

	public void getPrimeNumber(int number) {

		boolean isPrime = true;

		if (number == 1) {
			System.out.println(number + ":" + " " + "number is not prime");
			return;

		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(number + ":" + " " + "number is prime ");
		} else {
			System.out.println(number + ":" + " " + "number is not prime");
		}
	}
}
