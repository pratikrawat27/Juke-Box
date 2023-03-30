package Beams;

public class Playlist {
    private int playlistId;
    private String playlistName;
    private int userId;

    private int songid;


    public Playlist(int playlistId, String playlistName, int userId, int songid) {
        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.userId = userId;
        this.songid = songid;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", playlistName='" + playlistName + '\'' +
                ", userId=" + userId +
                ", songid=" + songid +
                '}';
    }


}