package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        
        // call getCars() and print the details for each Car instance in the list
        List<Car> cars = showroom.getCars();
        cars.forEach(car -> System.out.println(car));

    }

}
