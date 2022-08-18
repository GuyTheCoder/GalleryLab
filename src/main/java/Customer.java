import java.util.ArrayList;

public class Customer {

    private String customerName;
    private double wallet;

    private ArrayList<Artwork> customerArtwork;

    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.customerArtwork = new ArrayList<>();

    }

// method for purchasing the artwork below

    public void purchaseArtwork(Artwork artwork, Gallery gallery){
        if (wallet > artwork.getPrice()) {
        gallery.acceptPayment(artwork.getPrice());
        wallet -= artwork.getPrice();
        this.addArt(artwork);
        gallery.removeArt(artwork);
        }

    }

public void addArt(Artwork artwork){
        this.customerArtwork.add(artwork);
}

//    getters and setters

    public double getWallet(){
    return wallet;
    }

    public void setWallet(double wallet){
    this.wallet = wallet;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }


//    showing customer art collection
    public void showCustomerArtwork(){
        System.out.println("customer's art collection:");
        for (Artwork art: customerArtwork) {
            System.out.println(art.getTitle());
        }
        ;
    }

}
