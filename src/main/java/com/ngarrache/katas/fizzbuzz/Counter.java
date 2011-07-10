package com.ngarrache.katas.fizzbuzz;

/**
 * @author Nizar Garrache
 * 
 * @since 10 juil. 2011
 */
public class Counter {
	private final static String FIZZ = "Fizz";
	private final static String BUZZ = "Buzz";
	private final static String FIZZ_BUZZ = "FizzBuzz";

	public String answer(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number [" + number
					+ "] must be greater then 0");
		}
		if (multipleOfThreeAndFive(number) || containsThreeAndFive(number)
				|| (multipleOfThree(number) && containsFive(number))
				|| (multipleOfFive(number) && containsThree(number))) {
			return FIZZ_BUZZ;
		}
		if (multipleOfThree(number) || containsThree(number)) {
			return FIZZ;
		}
		if (multipleOfFive(number) || containsFive(number)) {
			return BUZZ;
		}
		return String.valueOf(number);
	}

	private boolean containsThree(int number) {
		return String.valueOf(number).contains("3");
	}

	private boolean containsFive(int number) {
		return String.valueOf(number).contains("5");
	}

	private boolean containsThreeAndFive(int number) {
		return String.valueOf(number).contains("3")
				&& String.valueOf(number).contains("5");
	}

	private boolean multipleOfThree(int number) {
		return number % 3 == 0;
	}

	private boolean multipleOfFive(int number) {
		return number % 5 == 0;
	}

	private boolean multipleOfThreeAndFive(int number) {
		return number % 3 == 0 && number % 5 == 0;
	}

}
