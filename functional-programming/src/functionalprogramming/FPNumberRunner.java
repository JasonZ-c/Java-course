package functionalprogramming;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,6,8,13,3,15);
		numbers.stream()
		.forEach(el -> System.out.println(el));
		
		fpSum(numbers);
		//normalSum(numbers);
	}

	private static void fpSum(List<Integer> numbers) {
		int sum = numbers.stream()
				.filter(num -> num%2==1)
				.reduce(
				0,
				(num1,num2)->{
					System.out.println(num1+"and"+num2);
					return num1+num2;
				});
		System.out.println(sum);
	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		System.out.println(sum);
	}

}
