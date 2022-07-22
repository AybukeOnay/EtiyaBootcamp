package recapDemos;

public class ArrayMaxVariable {

	public void arrayMax() {
		
	int[] numbers = { 3, 10, 7, 22, 18 };
	int total = 0;
	int max = numbers[0];

	for(int number:numbers)
	{
		if (max < number) {
			max = number;
		}
		total = total + number;
	}
	
	System.out.println("Toplam : " + total);
	System.out.println("En Büyük : " + max);

}}