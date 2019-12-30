package ch02.ex10;

import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();
    
    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }
    
    public static int randomElement(int[] array) {
    	if (array.length == 0) return 0;
    	int index = generator.nextInt(array.length);
    	return array[index];
    }
}