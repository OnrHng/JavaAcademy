package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import academy.everyonecodes.java.week9.optionalExceptions.ChatBot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAddressParserTest {

    @Test
    void parserValidEmail() {

        assertDoesNotThrow ( () -> {
            EmailAddressParser parser = new EmailAddressParser();
            parser.parser("abc@gmail");
        });
    }

    @Test
    void parserInvalidEmailHasNotAtSign() {

        assertThrows (InvalidEmailException.class, () -> {
            EmailAddressParser parser = new EmailAddressParser();
            parser.parser("abcgmail");
        });
    }

    @Test
    void parserInvalidEmailHasNotUsername() {

        assertThrows (InvalidEmailException.class, () -> {
            EmailAddressParser parser = new EmailAddressParser();
            parser.parser(" @gmail"); // user name is empty string
        });
    }
    @Test
    void parserInvalidEmailHasNotDomain() {

        assertThrows (InvalidEmailException.class, () -> {
            EmailAddressParser parser = new EmailAddressParser();
            parser.parser("abc@ ");
        });
    }
}