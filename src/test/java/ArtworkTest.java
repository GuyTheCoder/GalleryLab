import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    private Artwork artwork;

    @BeforeEach
    public void setUp(){
        this.artwork = new Artwork("mona lisa",new Artist("john"),10000,"abc");
    }

    @Test
    public void canGetPrice(){
        double actual = artwork.getPrice();
        double expected = 10000;
        assertThat(actual).isEqualTo(expected);
        // when taking the price out of the above defined artwork
        // seeing whether the price found is 10000
    }


    @Test
    public void canGetTitle(){
        String actual = artwork.getTitle();
        String expected = "mona lisa";
        assertThat(actual).isEqualTo(expected);
        // when looking at the title of the artwork,
        // we can see that the actual taken from the
        // defined example = the expected

    }


}
