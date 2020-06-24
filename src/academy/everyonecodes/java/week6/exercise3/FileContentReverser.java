package academy.everyonecodes.java.week6.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {
    public void reverse(Path inputPath, Path ouputPath) {
        List<String> lines;
        try {
            lines = Files.readAllLines(inputPath); // read the lines and add all into String List
            Collections.reverse(lines); // reverse list
            Files.write(ouputPath, lines); // write line output file.if it isnt exist, creat it.

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something goes wrong");
        }
    }
}
