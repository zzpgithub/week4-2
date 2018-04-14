package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        fizzBuzzGame.start(count);
        for (String s : fizzBuzzGame.getResults()) {
            System.out.println(s);
        }
    }

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(processNum(i));
        }
    }

    public String processNum(int i) {
        boolean flag = true;
        String str = "";
        if (String.valueOf(i).contains(String.valueOf(3))) {
            return "Fizz";
        }
        if (i % 3 == 0) {
            flag = false;
            str += "Fizz";
        }
        if (i % 5 == 0) {
            flag = false;
            str += "Buzz";
        }
        if (i % 7 == 0) {
            flag = false;
            str += "Whizz";
        }
        if (flag) {
            return String.valueOf(i);
        }
        return str;
    }

    public List<String> getResults() {
        return results;
    }
}




