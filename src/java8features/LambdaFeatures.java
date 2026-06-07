package java8features;

import java.util.List;
import java.util.Optional;

public class LambdaFeatures {
	public static void main(String[] args) {
		// ---double parameter
		MyInterface obj2 = (a, b) -> a + b;

		MyInterface obj = (a, b) -> {
			return a + b;
		};

		// MyInterface obj = (a,b)->System.out.println(Hii);

		// ---------single parameter
//       MyInterface obj = x->System.out.println(x+"hii");
//       obj.sayHello(2);
		// ----------- without parameter
		// MyInterface obj = ()-> System.out.println("hello");

//        MyInterface obj2 =()->{
//            System.out.println("Hii i am from multiple");
//        };
//        obj.sayHello();
//        obj2.sayHello();
		// printCourse(List.of("Spring","Spring Boot","Microservices","Docker"));
		// printEvenNumbers(List.of(1,2,3,4,5,6,7,8,9,20));
	}

	private static void printCourse(List<String> courses) {
		courses.stream().filter(course -> course.length() > 5).map(c -> c.length() + " " + c) // map is used to convert
																								// from original to
																								// other format
				.forEach(System.out::println);
	}

	private static void printEvenNumbers(List<Integer> list) {
		// filter is used to filter the record
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	public static void optionalClassExample() {
		/*
		 * OPTIONAL is used to handle the null pointer exception comes from the
		 * util.optional package
		 */
		Optional<String> strOptional = Optional.ofNullable(null);// here we tell ofNullable means value may have null or
																	// value is present
		strOptional.ifPresent(st -> System.out.println(st.length())); // here does not print any thing and no error
																		// because able we use ofNullable to hanle null
																		// if we written Optional.of() it shows an
																		// error here
		String valString = strOptional.orElse("Default value"); // if value is null means print this
		System.out.println(valString.getClass());

	}
}
