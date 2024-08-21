package com.cbfacademy;

/*
* Create a class FizzBuzz with a get method that takes a number and returns a string, but such that:

* for multiples of 3, it returns “Fizz” instead of the number
* for multiples of 5, it returns “Buzz” instead of the number
* for multiples of 15, it returns “FizzBuzz” instead of the number
* the string representation of the number otherwise
*/

public class FizzBuzz {

    public static String get(Integer n) {
        if (n % 3 == 0 && n % 5 == 0 ) return "FizzBuzz";
        if (n % 3 == 0 ) return "Fizz";
        if (n % 5 == 0 ) return "Buzz";

        return n.toString();
    }  
}
