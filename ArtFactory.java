// Our Master Blueprint
class Painting {
    String title;
    String artist;
    double price;

    // The Constructor (Our automated assembly line)
    public Painting(String title, String artist, double price) {
        this.title = title;   // Setting THIS object's variables
        this.artist = artist;
        this.price = price;
    }

    // Action to display details
    public void displayDetails() {
        System.out.println("Title: " + this.title + " | Artist: " + this.artist + " | Price: Rs. " + this.price);
    }
}

// Our main runner class
public class ArtFactory {
    public static void main(String[] args) {
        
        // Creating three separate art objects using our one-line constructor assembly power!
        Painting art1 = new Painting("Starry Night", "Van Gogh", 50000.00);
        Painting art2 = new Painting("Monalisa", "Da Vinci", 99999.00);
        Painting art3 = new Painting("The Scream", "Edvard Munch", 45000.00);
        
        // Displaying all of them to make sure they work perfectly
        art1.displayDetails();
        art2.displayDetails();
        art3.displayDetails();
    }
}
