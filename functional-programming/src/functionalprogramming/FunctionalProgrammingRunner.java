package functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("a","bat","cat");
		printBasic(list);
		printWithFP(list);
		printBasicWithFilter(list);
		printWithFPWithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for(String string:list)
			System.out.println(string);
	}
	
	private static void printBasicWithFilter(List<String> list) {
		for(String string:list)
			if(string.endsWith("at"))
				System.out.println(string);
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(
				el -> System.out.println("element"+el)
				);
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(
					el -> el.endsWith("at")
					)
			.forEach(
				el -> System.out.println("element"+el)
				);
	}

}
