package academy.everyonecodes.java.week8.set2.exercise1;

public class ThiefAttemptCounter {

    public int countAttempts(Safe safe, Thief thief) {

        int counter;

        if (safe.getSecurityLevel().toLowerCase().equals(thief.getLevel().toLowerCase())) {
            int difficultyPoint = safe.getDifficultyPoints();
            for (counter = 0; counter < difficultyPoint; counter++) {
                thief.open(safe);
                if (safe.getDifficultyPoints() <= 0) {
                    break;
                }
            }
        } else {
            System.out.println("Dear Thief! Your level is not enough for the Safe");
            return -1;
        }
        return counter;
    }
}
