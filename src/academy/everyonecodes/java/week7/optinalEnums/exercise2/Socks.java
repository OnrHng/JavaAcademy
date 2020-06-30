package academy.everyonecodes.java.week7.optinalEnums.exercise2;

public enum Socks {
    GREENSOCKS, YELLOWSOCKS,  REDSOCKS;

    private String description;

    public String getDescription(Socks sock) {

        switch (sock) {
            case REDSOCKS -> this.description = "red socks with stripes";
            case GREENSOCKS -> this.description = "green socks with white polka dots";
            case YELLOWSOCKS -> this.description = "yellow socks with white stripes";
        }
        return this.description;
    }
}
