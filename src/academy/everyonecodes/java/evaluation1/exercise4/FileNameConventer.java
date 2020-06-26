package academy.everyonecodes.java.evaluation1.exercise4;

public class FileNameConventer {
    public String convert(String fileName) {
        fileName = fileName.substring(9);// remove first 9 characters
        fileName = fileName.toLowerCase();// convert toLowerCase

        int indexOfMinus = fileName.indexOf("_");// get index of under Minus char

        if (indexOfMinus != -1){ // if file name has "_" , do all this if block statement
            fileName = fileName.replaceAll("_", "-");// replace all "_" to "-"
            // make capital first letter
            fileName = fileName.substring(0,1).toUpperCase() + fileName.substring(1);
            // get all character until "-" char (including "-)
            fileName = fileName.substring(0, indexOfMinus + 1)
                        // make uppercase the letter that is after the "-" char
                        + fileName.substring(indexOfMinus + 1, indexOfMinus + 2).toUpperCase()
                        // get all character those are after secondName capital letter until end
                        + fileName.substring(indexOfMinus + 2);
        }
        // if file extension is .docx , replace it .pdf oder
        // if file extension is .jpg, replace it .png

        if (fileName.endsWith(".docx") ) {
            fileName = fileName.replace(".docx", ".pdf");
        } else if (fileName.endsWith(".jpg")) {
            fileName = fileName.replace(".jpg", ".png");

        }
        return fileName;

    }
}
