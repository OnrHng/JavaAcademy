package academy.everyonecodes.java.week5.set2.exercise3;

import java.util.Objects;

public class HappinessRecord {
    private String countryName;
    private int rank;
    private double score;

    public HappinessRecord(String countryName, int rank, double score) {
        this.countryName = countryName;
        this.rank = rank;
        this.score = score;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord that = (HappinessRecord) o;
        return rank == that.rank &&
                Double.compare(that.score, score) == 0 &&
                Objects.equals(countryName, that.countryName);
    }
}
