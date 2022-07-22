package recapDemos;

import java.util.Random;

public class ArrayFindNumber {

	public void findNumberInArray(int number) {
		
		boolean numberInArray = false;
        Random random = new Random();
        int[] array = new int[random.nextInt(0, 100)];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                numberInArray = true;
                break;
            }
        }
        if (numberInArray) {
            System.out.println(number + ": is in the array");
        } else {
            System.out.println(number + ": is not in the array");
        }     
	}
}
