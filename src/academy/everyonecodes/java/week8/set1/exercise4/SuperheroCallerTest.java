package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();

    @Test
    void findSuperhero() {
        SuperHero expectedBatman = new Batman();
        Optional<SuperHero> resultBatman = caller.findSuperhero("Bruce Wayne");
        assertTrue(resultBatman.isPresent());
        assertEquals(expectedBatman, resultBatman.get());

        SuperHero expectedSuperman = new Superman();
        Optional<SuperHero> resultSuperman = caller.findSuperhero("SUPERMAN");
        assertTrue(resultSuperman.isPresent());
        assertEquals(expectedSuperman, resultSuperman.get());

        // can not find super hero
        Optional<SuperHero> emptyHero = caller.findSuperhero("Iron MAN");
        assertTrue(emptyHero.isEmpty());
    }
}