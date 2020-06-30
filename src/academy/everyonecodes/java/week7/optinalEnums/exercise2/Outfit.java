package academy.everyonecodes.java.week7.optinalEnums.exercise2;

public class Outfit {
    Headpiece headpiece;
    Socks sock;

    public String getDescription() {
        return headpiece.getDescription(headpiece) + " and " + sock.getDescription(sock);
    }
}
