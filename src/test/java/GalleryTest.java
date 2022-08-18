import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    private Gallery gallery;
    private  Artwork artwork;

    @BeforeEach
    public void setUp(){
        this.gallery = new Gallery("the gallery",5000,new Customer("john",1000));
        this.artwork = new Artwork("mona lisa",new Artist("john"),500,"abc");


    }

    @Test
    public void canAcceptPayment(){
        gallery.acceptPayment(100);
        double expected = 5100;
        double actual = gallery.getTill();
        assertThat(actual).isEqualTo(expected);

    }




//    @Test
//
//    public  void canAddArt(){
//
//        gallery.addArt(artwork);
//        ArrayList<Artwork> actual = this.artwork;
//    }

}
