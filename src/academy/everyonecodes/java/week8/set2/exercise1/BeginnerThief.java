package academy.everyonecodes.java.week8.set2.exercise1;

public class BeginnerThief implements Thief{

    private String level;
    private int skillLevel ;

    public BeginnerThief() {
        this.skillLevel = 1;
        this.level = "Beginner";
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
