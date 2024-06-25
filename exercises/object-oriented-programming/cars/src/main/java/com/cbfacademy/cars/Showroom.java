package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    // Car is the type of object that the list will contain 
    // public List<Car> getCars() {
    //     List<Car> list = new ArrayList<>();
    //     list.add(new Car("Volvo", "V40", "Blue", 2012));
    //     list.add(new Car("Porsche", "Panamera", "Red", 2009));
    //     list.add(new Car("Audi", "A3", "Grey", 2018));

    //     // Return the list of cars
    //     return list;
    // }
    
    private List<Car> carsList;

     // Constructor to initialize the car list
    public Showroom() {
        carsList = new ArrayList<>();
        carsList.add(new Car("Volvo", "V40", "Blue", 2012));
        carsList.add(new Car("Porsche", "Panamera", "Red", 2009));
        carsList.add(new Car("Audi", "A3", "Grey", 2018));
    }

    public List<Car> getCars() {
        return this.carsList;
    }
}


// public class Showroom {

//     private List<Car> cars = List.of(
//             new Car("Volvo", "V40", "Blue", 2012),
//             new Car("Porsche", "Panamera", "Red", 2009),
//             new Car("Audi", "A3", "Grey", 2018));

//     public List<Car> getCars() {
//         return cars;
//     }
// }