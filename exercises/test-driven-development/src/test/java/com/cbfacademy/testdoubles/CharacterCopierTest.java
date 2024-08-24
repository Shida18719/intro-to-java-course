package com.cbfacademy.testdoubles;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Character Copier Test")
public class CharacterCopierTest {

    @Test
    @DisplayName("Copy character from source to destination")
    void copyFromSourceToDestination() {
        final SourceSpy source = new SourceSpy();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier characterCopier = new CharacterCopier(source, destination);

        characterCopier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
    }
}
