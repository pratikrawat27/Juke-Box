package Beams;

public class Song {
    private int songId;
    private String songName;
    private String artistName;
    private String genre;
    private String album;
    private float duration;
    private String url;

    public Song(int songId, String songName,String artistName, String genre, String album, float duration, String url) {
        this.songId = songId;
        this.songName = songName;
        this.artistName=artistName;
        this.genre = genre;
        this.album = album;
        this.duration = duration;
        this.url = url;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", genre='" + genre + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                ", url='" + url + '\'' +
                '}';
    }
}
