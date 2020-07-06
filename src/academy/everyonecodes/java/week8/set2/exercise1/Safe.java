package academy.everyonecodes.java.week8.set2.exercise1;

public class Safe {
    private int difficultyPoints;
    private String securityLevel;

    public Safe(int difficultyPoints, String securityLevel) {
        this.difficultyPoints = difficultyPoints;
        this.securityLevel = securityLevel;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

}
