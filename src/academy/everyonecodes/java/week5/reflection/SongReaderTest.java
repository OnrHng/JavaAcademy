package academy.everyonecodes.java.week5.reflection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SongReaderTest {
    SongReader reader = new SongReader();

    @Test
    void read() {
        Song song = new Song(6, "I Don't Care (with Justin Bieber)", "Ed Sheeran", "pop");
        List<Song> songList = reader.read();
        assertFalse(songList.isEmpty());
        assertEquals(song, songList.get(7));
    }

    @Test
    void readEdgeCase() {
        Song song2 = new Song(4214, "!@!##!", "Q#", "!#E23");
        List<Song> songList = reader.read();
        assertFalse(songList.isEmpty());
        assertNotEquals(song2, songList.get(1));
    }

}