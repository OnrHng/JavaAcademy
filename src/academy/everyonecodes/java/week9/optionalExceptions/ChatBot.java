package academy.everyonecodes.java.week9.optionalExceptions;


public class ChatBot {

    public void handle(String firstArg, String secondArgs) throws WrongFirstArgumentException, WrongSecondArgumentException {

        if (!(firstArg.equals("temperature") || firstArg.equals("lights"))){
            setHomeUsingFirstArgument(firstArg);

        } else if (isNumeric(secondArgs) && firstArg.equals("temperature")){
            int tmpDegree = Integer.parseInt(secondArgs);
            if (tmpDegree < 0){
                System.out.println("Temperature lowered by " + Math.abs(tmpDegree));
            }else {
                System.out.println("Temperature raised by " + Math.abs(tmpDegree));
            }
        } else if ((secondArgs.equals("on") || secondArgs.equals("off")) && firstArg.equals("lights") ) {
            System.out.println("Lights " + secondArgs);
        } else {
            setHomeUsingSecondArgument(secondArgs);
        }
    }

    public void setHomeUsingFirstArgument(String firstArgument) throws WrongFirstArgumentException {
        System.out.println("Argument not supported : " + firstArgument);
        throw new WrongFirstArgumentException("Argument not supported : ");
    }

    public void setHomeUsingSecondArgument(String secondArgument) throws WrongSecondArgumentException {
        System.out.println("Argument not supported : " + secondArgument);
        throw new WrongSecondArgumentException("Argument not supported : ");
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
