import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    private Artist artist;
    @BeforeEach
    public void setUp(){
        this.artist = new Artist("mrArtist");

    }
    @Test
    public void canGetName() {
        String actual = artist.getArtistName();
        String expected = "mrArtist";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetName(){
        artist.setArtistName("james");
        String expected = "james";
        // not finished
       

    }
}
