package com.ngarrache.katas.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Nizar Garrache
 * 
 * @since 11 juil. 2011
 */
public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Counter.class);

	public static void main(String[] args) {
		Counter counter = new Counter();
		for (int turn = 1; turn <= 100; turn++) {
			LOGGER.info(counter.answer(turn));
		}
	}

}
