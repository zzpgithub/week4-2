package com.thoughtworks;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {


    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals(fizzBuzzGame.processNum(3),"Fizz");
        assertEquals(fizzBuzzGame.processNum(35),"Fizz");
        assertEquals(fizzBuzzGame.processNum(33),"Fizz");
        assertEquals(fizzBuzzGame.processNum(73),"Fizz");
    }

    @Test
    public void should_return_number_process_result() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

//        assertEquals(fizzBuzzGame.processNum(5),"Buzz");
//        assertEquals(fizzBuzzGame.processNum(15),"FizzBuzz");
//        assertEquals(fizzBuzzGame.processNum(16),"16");
//        assertEquals(fizzBuzzGame.processNum(21),"FizzWhizz");
//        assertEquals(fizzBuzzGame.processNum(28),"Whizz");
//        assertEquals(fizzBuzzGame.processNum(70),"BuzzWhizz");

        assertThat(fizzBuzzGame.processNum(5)).isEqualTo("Buzz");
        assertThat(fizzBuzzGame.processNum(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzzGame.processNum(16)).isEqualTo("16");
        assertThat(fizzBuzzGame.processNum(21)).isEqualTo("FizzWhizz");
        assertThat(fizzBuzzGame.processNum(28)).isEqualTo("Whizz");
        assertThat(fizzBuzzGame.processNum(70)).isEqualTo("BuzzWhizz");
    }
}
