package academy.everyonecodes.java.week5.reflection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SongReader {
    public List<Song> read() {
        Path pathFile = Path.of("src/academy/everyonecodes/java/week5/reflection/spotify_top50.csv");

        // create an empty List of Song to add into the Songs
        List<Song> songList = new ArrayList<>();

        // read file
        try {
            List<String> lines = Files.readAllLines(pathFile);
            for (String line : lines) {
                // split the line with ','
                String[] parsedLine = line.split(",");
                // skip first line
               // if (parsedLine[0].equals("Rank")){
               //     continue;
               // }
                //  create a Song and add it into the SongList
                songList.add(new Song(Integer.parseInt(parsedLine[0]), parsedLine[1], parsedLine[2], parsedLine[3]));
            }
            // return song list
            return songList;
        } catch (IOException e) {
            System.out.println("Something goes wrong! file context is wrong or file is empty");
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
