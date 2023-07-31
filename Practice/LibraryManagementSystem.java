//11
class Item {
    String title;
    int publicationYear;

    // Constructor for Item class
    Item(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display information about the item
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends Item {
    String author;
    int pageCount;

    // Constructor for Book class
    Book(String title, int publicationYear, String author, int pageCount) {
        super(title, publicationYear); // Call the constructor of the superclass (Item)
        this.author = author;
        this.pageCount = pageCount;
    }

    // Method to override the displayInfo method and include book-specific information
    @Override
    void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Item)
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}

class DVD extends Item {
    String director;
    int duration;

    // Constructor for DVD class
    DVD(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear); // Call the constructor of the superclass (Item)
        this.director = director;
        this.duration = duration;
    }

    // Method to override the displayInfo method and include DVD-specific information
    @Override
    void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Item)
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create an object of the Book class
        Book book = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", 180);
        // Call the displayInfo method of the Book class to display book-specific information
        book.displayInfo();

        // Create an object of the DVD class
        DVD dvd = new DVD("Inception", 2010, "Christopher Nolan", 148);
        // Call the displayInfo method of the DVD class to display DVD-specific information
        dvd.displayInfo();
    }
}

