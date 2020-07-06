package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Superman implements SuperHero {

    private String privateName;
    private String heroName;

    public Superman() {
        this.privateName = getPrivateName();
        this.heroName = getHeroName();
    }

    @Override
    public String getPrivateName() {
        return "Clark Joseph Kent";
    }

    @Override
    public String getHeroName() {
        return "Superman";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superman superman = (Superman) o;
        return privateName.equals(superman.privateName) &&
                heroName.equals(superman.heroName);
    }
}
