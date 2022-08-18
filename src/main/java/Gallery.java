import java.util.ArrayList;

public class Gallery {

private String name;
private double till;
private ArrayList<Artwork> artwork;
// an empty array list for the gallery to hold the artwork

private Customer customer;
// we have created 3 properties for each gallery to have


// whenever we create a gallery, it must have values for the
   // 3 below parameters within the bracket.
   public Gallery(String name, int till, Customer customer){
      this.name = name;
      this.till = till;
      this.artwork = new ArrayList<>();
      // this step is to actually create the array list
      this.customer = customer;

   }

//   unique methods

    public void acceptPayment(double payment){
       till += payment;
       // till increases by the payment amount
    }

    public  void addArt(Artwork artwork){
       this.artwork.add(artwork);
       // .add adds it onto the gallerys artwork list
    }

    public void removeArt(Artwork artwork){
       this.artwork.remove(artwork);
       // this does the opposite as the previous step
    }

// getters and setter methods
    public String getName(){
       return name;
    }
    
    public void setName(){
    this.name = name;
    }

   public double getTill(){
       return till;
   }

   public void setTill(int till){
       this.till = till;
   }

   public void showArtwork(){
       System.out.println("gallery's art collection:");
       for ( Artwork art: artwork) {
           System.out.println(art.getTitle());
           // for all the arts in artwork, you print the title
       }
   }

   public String  stockTake(){
       double stockValue = 0;
       for (Artwork art: artwork) {
           stockValue += art.getPrice();
       }
       return "Total stock value= " + stockValue;
       // extension: after starting at 0, a for loop 
       // which goes through the different artworks
       // and increases the stock value by the artworks price

   }




}
