package com.cbfacademy.testdoubles;

interface Source {
    String getChar();
}

// Source where characters are being read and copied to a Destination 
public class SourceSpy implements Source {
    private Integer numberOfCalls = 0;

    @Override
    public String getChar() {
        this.numberOfCalls = this.numberOfCalls + 1;
        return "null";

    }

    Boolean wasCalled() {
        return this.numberOfCalls > 0;
    }
}
