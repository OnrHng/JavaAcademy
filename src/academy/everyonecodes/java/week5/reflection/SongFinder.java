package academy.everyonecodes.java.week5.reflection;

import java.util.List;
import java.util.Optional;

public class SongFinder {
    public Optional<Song> find(List<Song> songList, String songName) {
        // list of songs is not empty , try to find a song and return it, otherwise return Optional empty
        if (!songList.isEmpty()){
            for (Song song : songList) {
                return (song.getName().equals(songName)) ? Optional.of(song) : Optional.empty();
            }
        }
        return Optional.empty();
    }
}
