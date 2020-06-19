package academy.everyonecodes.java.week5.reflection;

import java.util.Objects;

public class Song {
    private int rank;
    private String name;
    private String artist;
    private String genre;

    public Song(int rank, String name, String artist, String genre) {
        this.rank = rank;
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return rank == song.rank &&
                Objects.equals(name, song.name) &&
                Objects.equals(artist, song.artist) &&
                Objects.equals(genre, song.genre);
    }

}
