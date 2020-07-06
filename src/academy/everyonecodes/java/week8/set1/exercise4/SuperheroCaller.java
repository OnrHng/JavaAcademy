package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {
    public Optional<SuperHero> findSuperhero(String keyword) {
        keyword = keyword.toLowerCase();

        SuperHero batman = new Batman();
        SuperHero superman = new Superman();
        SuperHero spiderman = new Spiderman();
        List<SuperHero> superHeroes = List.of(batman, superman, spiderman);

        for (SuperHero superHero : superHeroes) {
            if (superHero.getPrivateName().toLowerCase().equals(keyword) || superHero.getHeroName().toLowerCase().equals(keyword)) {
                return Optional.of(superHero);
            }
        }
        return Optional.empty();
    }

}
