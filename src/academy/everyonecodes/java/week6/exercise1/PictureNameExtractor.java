package academy.everyonecodes.java.week6.exercise1;

public class PictureNameExtractor {
    public String extract(String input) {
        String modifiedInput = "";
        try {
            if (input != null && !input.isEmpty()) {
                input = input.toLowerCase();
                // in String remove all digits no matter where
                for (char ch : input.toCharArray()) {
                    if (!Character.isDigit(ch)) {
                        modifiedInput += ch;
                    }
                }
            }
            if (modifiedInput.contains(".jpg")){
                modifiedInput = modifiedInput.replace(".jpg", "");
            }
            if (modifiedInput.contains("pic")){
                modifiedInput = modifiedInput.replace("pic", "");
            }
            if (modifiedInput.contains("-")){
                modifiedInput = modifiedInput.replace("-", " ");
            }
            return modifiedInput;
        } catch (Exception e) {
            System.out.println("Something goes wrong!");
            e.printStackTrace();
            return "";
        }
    }
}
