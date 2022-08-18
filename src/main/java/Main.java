public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("alan", 5000);
        Gallery gallery = new Gallery("The Gallery", 10000, customer1);
        Artwork artwork1 = new Artwork("mona lisa", new Artist("john"), 1000, "abcd");
        Artwork artwork2 = new Artwork("starry night", new Artist("vincent"), 2500, "abc");


        gallery.addArt(artwork1);
        gallery.addArt(artwork2);
        gallery.showArtwork();
        System.out.println(gallery.stockTake());
        customer1.purchaseArtwork(artwork1,gallery);
        

        gallery.showArtwork();
        customer1.showCustomerArtwork();
        System.out.println(customer1.getWallet());
        System.out.println(gallery.getTill());






    }
    
}
