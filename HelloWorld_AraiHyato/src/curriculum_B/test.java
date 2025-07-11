package curriculum_B;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test {

	public class InputExampleList {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> numbers = new ArrayList<>();

	        System.out.print("数値を入力してください (スペース区切り): ");
	        String input = scanner.nextLine();
	        String[] inputArray = input.split(" ");

	        for (String s : inputArray) {
	            try {
	                numbers.add(Integer.parseInt(s));
	            } catch (NumberFormatException e) {
	                System.out.println("無効な数値です: " + s);
	            }
	        }

	        System.out.println("入力された数値:");
	        for (int number : numbers) {
	            System.out.println(number);
	        }

	        scanner.close();
	    }
	}

}
