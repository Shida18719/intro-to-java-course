package com.cbfacademy;

/**
* Create a class Year with a isLeap method that checks whether its input integer is a Leap Year or not:

* years divisible by 400 are leap years
* years divisible by 100 but not by 400 are not leap years
* years divisible by 4 but not by 100 are leap years
* years not divisible by 4 are not leap years
*/

public class Year {
    private final Integer year;
    
    public Year(Integer year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        // Years divisible by 400 are leap years
        if(this.year % 400 == 0) {
            return true;
        }

        // Years divisible by 100 but not by 400 are not leap years
        if(this.year % 100 == 0 && this.year % 400 != 0) {
            return false;
        }

        // Years divisible by 4, but not by 100 are leap years
        if(this.year % 4 == 0 && this.year % 100 != 0) {
            return true;
        }
        return false;
    }
        
}
