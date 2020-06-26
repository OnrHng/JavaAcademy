package academy.everyonecodes.java.evaluation1.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {
    public List<Integer> read(){
        // read file
        Path pathFile = Path.of("src/academy/everyonecodes/java/evaluation1/exercise3/strings.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(pathFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("something goes wrong!");
        }

        // write length of line into integer list
        List<Integer> integerList = new ArrayList<>();
        for (String line : lines) {
            integerList.add(line.length());
        }
        return integerList;
    }
}
