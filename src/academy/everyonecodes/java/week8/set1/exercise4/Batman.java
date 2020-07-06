package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Batman implements SuperHero {

    private String privateName;
    private String heroName;

    public Batman() {
        this.privateName = getPrivateName();
        this.heroName = getHeroName();
    }

    @Override
    public String getPrivateName() {
        return "Bruce Wayne";
    }

    @Override
    public String getHeroName() {
        return "Batman";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batman batman = (Batman) o;
        return privateName.equals(batman.privateName) &&
                heroName.equals(batman.heroName);
    }
}
