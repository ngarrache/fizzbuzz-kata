package com.ngarrache.katas.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Nizar Garrache
 * 
 * @since 10 juil. 2011
 */
public class Counter {
	private static final Logger LOGGER = LoggerFactory.getLogger(Counter.class);

	public String answer(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number [" + number
					+ "] must be greater then 0");
		}
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		if (number % 3 == 0) {
			return "Fizz";
		}
		if (number % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(number);
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		for (int turn = 1; turn <= 100; turn++) {
			LOGGER.info(counter.answer(turn));
		}
	}

}
