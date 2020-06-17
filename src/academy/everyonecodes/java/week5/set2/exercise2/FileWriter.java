package academy.everyonecodes.java.week5.set2.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {
    public void write(Path filePath, List<String> dataList) {
        try {
            Files.write(filePath, dataList);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something goes wrong!");
        }
    }

    public void append(Path filePath, List<String> dataList) {
        try {
            Files.write(filePath, dataList, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something goes wrong!");
        }
    }
}
