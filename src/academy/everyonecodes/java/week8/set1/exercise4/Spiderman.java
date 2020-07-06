package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Spiderman implements SuperHero {

    private String privateName;
    private String heroName;

    public Spiderman() {
        this.privateName = getPrivateName();
        this.heroName = getHeroName();
    }

    @Override
    public String getPrivateName() {
        return "Peter Benjamin Parker";
    }

    @Override
    public String getHeroName() {
        return "Spiderman";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spiderman spiderman = (Spiderman) o;
        return privateName.equals(spiderman.privateName) &&
                heroName.equals(spiderman.heroName);
    }
}
