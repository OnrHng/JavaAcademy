package academy.everyonecodes.java.week4.set1.exercise4;

import java.util.Objects;

public class FilmCharacter {
    private String firstName;
    private String lastName;

    public FilmCharacter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmCharacter that = (FilmCharacter) o;
        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName);
    }

}
