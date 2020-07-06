package academy.everyonecodes.java.week8.set2.exercise1;

public class AdvancedThief implements Thief{

    private String level;
    private int skillLevel ;

    public AdvancedThief() {
        this.skillLevel = 2;
        this.level = "Advanced";
    }

    @Override
    public void open(Safe safe) {
        safe.setDifficultyPoints(safe.getDifficultyPoints() - skillLevel);

    }

    public String getLevel() {
        return level;
    }

    public int getSkillLevel() {
        return skillLevel;
    }
}
