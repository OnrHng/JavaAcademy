package academy.everyonecodes.java.evaluation2.optionals.exceptions;

public class EmailAddress {
    private String username;
    private String domain;

    public EmailAddress(String username, String domain) {
        this.username = username;
        this.domain = domain;
    }

    public String getUsername() {
        return username;
    }

    public String getDomain() {
        return domain;
    }
}
