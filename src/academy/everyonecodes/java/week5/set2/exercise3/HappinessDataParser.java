package academy.everyonecodes.java.week5.set2.exercise3;

import java.util.Optional;

public class HappinessDataParser {
    public Optional<HappinessRecord> parseLine(String line) {

        try {
            String[] parsedLine = line.split(",");
            return Optional.of(new HappinessRecord(parsedLine[1], Integer.parseInt(parsedLine[0]), Double.parseDouble(parsedLine[2])));

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Line format is wrong or line is empty");
            e.printStackTrace();
            return Optional.empty();
        }

    }
}
