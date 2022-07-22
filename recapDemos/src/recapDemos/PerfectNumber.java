package recapDemos;

//Sayının bölenleri toplamı sayının kendisini vermelidir.
// 6 --> 1,2,3 / 28 --> 1,2,4,7,14
public class PerfectNumber {

	public void isNumberPerfect(int number) {
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i ;
			}
		}
		
		if (total == number) {
			System.out.println(number + ":" + " " + "Number is perfect");
		}else {
			System.out.println(number + ":" + " " + "Number is not perfect");
		}
	}
}
