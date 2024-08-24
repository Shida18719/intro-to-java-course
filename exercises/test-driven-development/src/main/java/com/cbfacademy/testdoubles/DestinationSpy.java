package com.cbfacademy.testdoubles;

// Method that takes characters copied from the Source
interface Destination {
    void setChar(final String character);
}

public class DestinationSpy implements Destination {
    private Integer numberOfCalls;

    @Override
    public void setChar(final String character) {
        this.numberOfCalls = this.numberOfCalls + 1;
    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }
    
}
