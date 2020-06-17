package academy.everyonecodes.java.week5.set2.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {
    public List<Optional<HappinessRecord>> read() {
        Path filePath = Path.of("src/academy/everyonecodes/java/week5/set2/world-happiness-2019.csv");

        List<String> lines;
        List<Optional<HappinessRecord>> happinessRecordList = new ArrayList<>();

        HappinessDataParser parser = new HappinessDataParser();
        try {
            lines = Files.readAllLines(filePath);
            for (String line : lines) {
                happinessRecordList.add(parser.parseLine(line));
            }
            return happinessRecordList;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
