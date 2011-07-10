package com.ngarrache.katas.fizzbuzz;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

/**
 * @author Nizar Garrache
 * 
 * @since 10 juil. 2011
 */
public class CounterTest {
	private Counter counter = new Counter();

	@Test
	public void answer_InputIsMultipleOf3And5_ReturnFizzBuzz() {
		assertThat(counter.answer(15)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(30)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(45)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(60)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(75)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(90)).isEqualTo("FizzBuzz");
	}

	@Test
	public void answer_InputIsOnlyMultipleOf3_ReturnFizz() {
		assertThat(counter.answer(3)).isEqualTo("Fizz");
		assertThat(counter.answer(6)).isEqualTo("Fizz");
		assertThat(counter.answer(9)).isEqualTo("Fizz");
		assertThat(counter.answer(12)).isEqualTo("Fizz");
		assertThat(counter.answer(18)).isEqualTo("Fizz");
		assertThat(counter.answer(21)).isEqualTo("Fizz");
		assertThat(counter.answer(24)).isEqualTo("Fizz");
	}
	
	@Test
	public void answer_InputHas3InIt_ReturnFizz() {
		assertThat(counter.answer(34)).isEqualTo("Fizz");
		assertThat(counter.answer(37)).isEqualTo("Fizz");
		assertThat(counter.answer(34)).isEqualTo("Fizz");
		assertThat(counter.answer(31)).isEqualTo("Fizz");
	}

	@Test
	public void answer_InputHas3InItAndIsMultipleOf5_ReturnFizzBuzz() {
		assertThat(counter.answer(35)).isEqualTo("FizzBuzz");
	}

	@Test
	public void answer_InputIsOnlyMultipleOf5_ReturnBuzz() {
		assertThat(counter.answer(5)).isEqualTo("Buzz");
		assertThat(counter.answer(10)).isEqualTo("Buzz");
		assertThat(counter.answer(20)).isEqualTo("Buzz");
		assertThat(counter.answer(25)).isEqualTo("Buzz");
		assertThat(counter.answer(40)).isEqualTo("Buzz");
		assertThat(counter.answer(50)).isEqualTo("Buzz");
	}
	
	@Test
	public void answer_InputHas5InIt_ReturnBuzz() {
		assertThat(counter.answer(52)).isEqualTo("Buzz");
		assertThat(counter.answer(56)).isEqualTo("Buzz");
		assertThat(counter.answer(58)).isEqualTo("Buzz");
	}

	@Test
	public void answer_InputHas5InItAndIsMultipleOf3_ReturnFizzBuzz() {
		assertThat(counter.answer(51)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(54)).isEqualTo("FizzBuzz");
		assertThat(counter.answer(57)).isEqualTo("FizzBuzz");
	}


	@Test
	public void answer_InputNotMultipleOf3Or5_ReturnIdentity() {
		assertThat(counter.answer(1)).isEqualTo("1");
		assertThat(counter.answer(2)).isEqualTo("2");
		assertThat(counter.answer(7)).isEqualTo("7");
		assertThat(counter.answer(22)).isEqualTo("22");
		assertThat(counter.answer(47)).isEqualTo("47");
		assertThat(counter.answer(88)).isEqualTo("88");
		assertThat(counter.answer(91)).isEqualTo("91");
	}

	@Test(expected = IllegalArgumentException.class)
	public void answer_InputIs0_ThrowException() {
		counter.answer(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void answer_InputIsNegative_ThrowException() {
		counter.answer(-10);
	}
}
