package academy.everyonecodes.java.week6.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AverageWriter {
    public void write(Path inputPath, Path ouputPath) {
        List<String> lines;
        List<String> avgList = new ArrayList<>();

        try {
            lines = Files.readAllLines(inputPath);
            for (String line : lines) {
                // convert the line to String Arr
                String[] lineArr = line.split(" ");
                int sum = 0;
                // calculate sum
                for (String num : lineArr) {
                    sum += Integer.parseInt(num);
                }
                // get average and add it to average List
                double average = (double)sum / lineArr.length;
                avgList.add(String.valueOf(average));
            }
            // write average List to output file
            Files.write(ouputPath, avgList);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something goes wrong");
        }
    }
}
