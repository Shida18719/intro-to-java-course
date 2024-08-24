package com.cbfacademy.testdoubles;

// Method that takes characters copied from the Source
interface Destination {
    void setChar(final String character);
}

public class DestinationSpy implements Destination {
    private Integer numberOfCalls = 0; // Add value to Number of times the method was called

    @Override
    public void setChar(final String character) {
        this.numberOfCalls = this.numberOfCalls + 1;
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }
    
}
