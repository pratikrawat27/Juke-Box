import Beams.Playlist;
import Beams.Song;
import model.UserDetails;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;



public class UserDetailsTest {
    @Test
    public void SearchsongTest() {
        ArrayList<Song> list = UserDetails.Searchsong("No Role Modelz");
        assertEquals(1, (list.size()));
    }

    @Test
    public void GenreTest() {
        ArrayList<Song> list1 = UserDetails.SearchByGenre("R&B/Soul");
        assertEquals(2, (list1.size()));
    }

    @Test
    public void artistTest() {
        ArrayList<Song> list2 = UserDetails.SearchByArtist("Jagjit Singh");
        assertEquals(1, (list2.size()));
    }

    @Test
    public void Songs() {
        ArrayList<Song> list3 = UserDetails.songs();
        assertEquals(10, (list3.size()));
    }

}