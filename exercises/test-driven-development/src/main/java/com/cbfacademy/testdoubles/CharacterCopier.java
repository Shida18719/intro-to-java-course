package com.cbfacademy.testdoubles;

//  Class that reads characters from a Source and copies them to a Destination
public class CharacterCopier {
    private final Source source;
    private final Destination destination;

    public CharacterCopier(final Source source, final Destination destination) {
        this.source = source;
        this.destination = destination;
    }

    public void copy() {
        final String character = this.source.getChar();
        this.destination.setChar(character);
    }
}
