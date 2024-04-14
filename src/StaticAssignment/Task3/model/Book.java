package StaticAssignment.Task3.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved = false; // New field to indicate reservation status

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters for fields
    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getTitle() {
        return title;
    }

}
