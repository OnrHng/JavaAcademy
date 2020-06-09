package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmCharacterParserTest {

    @Test
    void parse() {
        FilmCharacter expected1 = new FilmCharacter("Anakin", "Skywalker");
        FilmCharacter result = FilmCharacterParser.parse("Anakin;Skywalker");

        assertEquals(expected1.getFirstName(), result.getFirstName()); // test for first name
        assertEquals(expected1.getLastName(), result.getLastName()); // test for last name

        FilmCharacter expected2 = new FilmCharacter("Frodo", "Baggins");
        FilmCharacter result2 = FilmCharacterParser.parse("Frodo;Baggins");

        assertEquals(expected2.getFirstName(), result2.getFirstName()); // test for first name
        assertEquals(expected2.getLastName(), result2.getLastName()); // test for last name

    }

    @Test
    void parseObjectHasEmptyString() {
        FilmCharacter expected = new FilmCharacter("", "");

        FilmCharacter result = FilmCharacterParser.parse(";");
        assertEquals(expected.getFirstName(), result.getFirstName()); // test for first name
        assertEquals(expected.getLastName(), result.getLastName()); // test for last name

    }
}