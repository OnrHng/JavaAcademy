package academy.everyonecodes.java.week7.optinalEnums.exercise2;

public enum  Headpiece {
    BEANIE, HAT;

    private String description;

    public String getDescription(Headpiece headpiece) {
        switch (headpiece) {
            case BEANIE -> this.description = "wool beanie with pink color";
            case HAT -> this.description = "old white hat";
        }
        return this.description;
    }
}
