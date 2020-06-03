package academy.everyonecodes.java.week3.set1.exercise4;

public class ChangeFileExtension {

    public static String generateNewName(String fileName){

        String fileNameNotExtension = fileName.substring(0, fileName.length() - 4);
        fileNameNotExtension += ".png";

        return fileNameNotExtension;
    }

     /* public static void main(String[] args) {
        System.out.println("New Name is : " + generateNewName("picture.jpg"));
    } */
}
