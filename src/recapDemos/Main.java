package recapDemos;

public class Main {

	public static void main(String[] args) {
		
		ArrayMaxVariable arrayMaxVariable = new ArrayMaxVariable();
		arrayMaxVariable.arrayMax();
		
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.getPrimeNumber(25);
		
		VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
		vowelOrConsonant.isVowelOrConsonant('k');
		
		PerfectNumber perfectNumber = new PerfectNumber();
		perfectNumber.isNumberPerfect(6);
		
		FriendlyNumber friendlyNumber = new FriendlyNumber();
		friendlyNumber.findFriendlyNumber(220, 284);
		
		ArrayFindNumber arrayFindNumber = new ArrayFindNumber();
		arrayFindNumber.findNumberInArray(5);
				
	}
	

}
