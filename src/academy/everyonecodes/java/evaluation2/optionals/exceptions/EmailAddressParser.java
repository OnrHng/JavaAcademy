package academy.everyonecodes.java.evaluation2.optionals.exceptions;

public class EmailAddressParser {

    public EmailAddress parser(String email) throws InvalidEmailException {
        if (checkEmailIsValid(email)) {
            String[] splittedEmail = email.split("@");
            return new EmailAddress(splittedEmail[0], splittedEmail[1]);
        }
        throw new InvalidEmailException("Email address is not valid!");
    }

    public boolean checkEmailIsValid(String email){
        int indexAtSign = email.indexOf("@");
        if (indexAtSign != -1) {
            String[] splittedEmail = email.split("@");
            if (splittedEmail[0].length() != 0 && splittedEmail[1].length() != 0 &&
                    !splittedEmail[0].equals(" ") && !splittedEmail[1].equals(" ")) {
                return true;
            }
        }
        return false;
    }
}
