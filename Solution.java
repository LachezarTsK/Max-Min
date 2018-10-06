import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int maxMin(int numberOfElementsInSubarray, int[] inputArray) {
		int minUnfairness = (int) Math.pow(10, 9);
		Arrays.sort(inputArray);

		for (int i = 0; i < inputArray.length - numberOfElementsInSubarray+1; i++) {
			int currentUnfairness = inputArray[i + numberOfElementsInSubarray - 1] - inputArray[i];
			minUnfairness = Math.min(minUnfairness, currentUnfairness);
		}
		return minUnfairness;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int numberOfElementsInArray = reader.nextInt();
		int numberOfElementsInSubarray = reader.nextInt();
		int[] inputArray = new int[numberOfElementsInArray];

		for (int i = 0; i < numberOfElementsInArray; i++) {
			inputArray[i] = reader.nextInt();
		}

		reader.close();
		int result = maxMin(numberOfElementsInSubarray, inputArray);
		System.out.println(result);
	}
}
