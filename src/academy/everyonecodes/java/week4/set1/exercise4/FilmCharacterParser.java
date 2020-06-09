package academy.everyonecodes.java.week4.set1.exercise4;

public class FilmCharacterParser {

    public static FilmCharacter parse(String name) {
        // replace all ';' to ' '
        name = name.replace(";", " ");

        int indexOfEmpty = name.indexOf(" "); // after replace method, get the ' ' String index

        String firstName = name.substring(0, indexOfEmpty); // initialize first name until ' ' String
        String lastName = name.substring(indexOfEmpty + 1); // initialize laste name after ' ' String

        return new FilmCharacter(firstName, lastName);
    }
}
