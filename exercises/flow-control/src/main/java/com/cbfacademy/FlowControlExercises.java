package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        // throw new RuntimeException("Not implemented");

        List<String> fizzBuzzList = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if(numbers.get(i) % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if(numbers.get(i) % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(numbers.get(i).toString());
            }
        }
        return fizzBuzzList;

    }


    // alternative solution using .forEach() with the lambda syntax:
    // public List<String> fizzBuzz(List<Integer> numbers) {
    //     List<String> strings = new ArrayList<String>();

    //     numbers.forEach(number -> {
    //         if (number % 5 == 0 && number % 3 == 0) {
    //             strings.add("FizzBuzz");
    //         } else if (number % 3 == 0) {
    //             strings.add("Fizz");
    //         } else if (number % 5 == 0) {
    //             strings.add("Buzz");
    //         } else {
    //             strings.add(number.toString());
    //         }
    //     });

    //     return strings;

    // }



    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        // throw new RuntimeException("Not implemented");

        switch(number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        Map<String, Integer> sumsOfNumbers = new HashMap<>();

         // Inserting entries in the Map
         
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
