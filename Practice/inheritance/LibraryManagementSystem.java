//11

/*
11.You are building a library management system. The base class is Item, which represents a library item
 and has attributes like title and publication Year, and a method called display Info (). The subclasses
  are Book and DVD, which inherit from Item. The Book class adds attributes like author* and Pagecount, 
  and the DVD class adds attributes like director and duration. Implement the classes and demonstrate the
   combination of single and hierarchical inheritance by creating objects of each class and calling their 
   respective methods. */
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
// output
// Title: The Great Gatsby
// Publication Year: 1925
// Author: F. Scott Fitzgerald
// Page Count: 180
// Title: Inception
// Publication Year: 2010
// Director: Christopher Nolan
// Duration: 148 minutes