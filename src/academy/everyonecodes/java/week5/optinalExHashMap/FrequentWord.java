package academy.everyonecodes.java.week5.optinalExHashMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentWord {
    public static void main(String[] args) {
        // create String String HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // I created small txt file with the Lower case and Upper case names,
        // just make sure the program is running perfectly
        //Path path = Path.of("src/academy/everyonecodes/java/week5/optinalExHashMap/testFileForMostFrequentName.txt");

        // read all lines in the file and return a list of lines
        List<String> lines = new ArrayList<>();
        Path path = Path.of("src/academy/everyonecodes/java/week5/optinalExHashMap/words_shuffled.txt");
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // add all name in the file into the HashMap
        // if there is a same name , increase the value one more
        for (String name : lines) {
            String nameLowerCase = name.toLowerCase();
            if (hashMap.containsKey(nameLowerCase)) {
                hashMap.put(nameLowerCase, hashMap.get(nameLowerCase) + 1);
            }else {
                int i = 1;
                hashMap.put(nameLowerCase, i);
            }
        }

        //after then one loop again to get max value in the HashMap values
        int maxValue = 0;
        for (Integer value : hashMap.values()) {
            if (value > maxValue) maxValue = value;
        }

        // get the key using maxValue
        String mostFrequentName = "";
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                mostFrequentName = entry.getKey();
            }
        }

        // print it
        System.out.println("In the words_shuffled.txt file the most frequent name is "
                            + mostFrequentName + " with the value " + maxValue
                          );
        // result :
        // In the words_shuffled.txt file the most frequent name is java with the value 21

    }
}
