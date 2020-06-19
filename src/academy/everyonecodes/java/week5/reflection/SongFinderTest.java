package academy.everyonecodes.java.week5.reflection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SongFinderTest {
    SongReader reader = new SongReader();
    SongFinder finder = new SongFinder();


    @Test
    void find() {
        List<Song> songList = reader.read();
        assertFalse(songList.isEmpty());

        Song song = new Song(6, "I Don't Care (with Justin Bieber)", "Ed Sheeran", "pop");
        Optional<Song> result = finder.find(songList, "I Don't Care (with Justin Bieber)");
        assertTrue(result.isPresent());
        assertEquals(song.getName(), result.get().getName());

        Song song2 = new Song(1, "Señorita", "Shawn Mendes", "canadian pop");
        Optional<Song> result2 = finder.find(songList, "Señorita");
        assertTrue(result2.isPresent());
        assertEquals(song2.getName(), result2.get().getName());

    }

    @Test
    void findEdgeCase() {
        Song wrongSong = new Song(241, "@!#$", "3231", "dwq1213");
        List<Song> songList = reader.read();
        Optional<Song> wrongResult = finder.find(songList, "Ransom");
        assertNotEquals(wrongSong, wrongResult);

    }
}