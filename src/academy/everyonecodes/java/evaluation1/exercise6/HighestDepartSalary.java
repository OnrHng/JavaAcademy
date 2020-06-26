package academy.everyonecodes.java.evaluation1.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestDepartSalary {

    public static void main(String[] args) {
        // create String String HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        //read file
        Path pathFile = Path.of("src/academy/everyonecodes/java/evaluation1/exercise6/salary.csv");
        try {
            List<String> lines = Files.readAllLines(pathFile);
            lines.remove(0);// skip first line
            for (String line : lines) {
                // split the line with ','
                String[] parsedLine = line.split(",");
                // if hashmap contains key , increase value, otherwise add new one
                if (hashMap.containsKey(parsedLine[0])) {
                    hashMap.put(parsedLine[0], hashMap.get(parsedLine[0]) + Integer.parseInt(parsedLine[2]));
                } else {
                    hashMap.put(parsedLine[0], Integer.parseInt(parsedLine[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // max salary
        int maxValue = 0;
        for (Integer value : hashMap.values()) {
            if (value > maxValue) maxValue = value;
        }

        // get the key using maxValue
        String departmentName = "";
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                departmentName = entry.getKey();
            }
        }
        // print it
        System.out.println("The department with the highest total salary costs is "
                + departmentName + " with the value " + maxValue);

    }
}
