package academy.everyonecodes.java.evaluation1.exercise3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineLengthWriter {
    public void write() {
        LineLengthReader reader =  new LineLengthReader();
        IntegerListToStringListConverter converter = new IntegerListToStringListConverter();

        List<Integer> integerList = reader.read();
        // convert integer list to string list to write using converter
        List<String> stringList = converter.convert(integerList);

        //write line
        Path path = Path.of("src/academy/everyonecodes/java/evaluation1/exercise3/stringLengths.txt");
        try {
            Files.write(path, stringList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
