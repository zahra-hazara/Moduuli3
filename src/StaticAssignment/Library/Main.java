package StaticAssignment.Library;
import StaticAssignment.Library.model.Book;
import StaticAssignment.Library.model.LibraryMember;
import StaticAssignment.Library.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("Java Programming", "John Doe", "123456789");
        Book book2 = new Book("Python Programming", "Jane Smith", "987654321");

        // Create some library members
        LibraryMember member1 = new LibraryMember("Alice", 1001);
        LibraryMember member2 = new LibraryMember("Bob", 1002);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Add members to the library
        library.addMember(member1);
        library.addMember(member2);

        // Perform borrowing and returning operations
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);
        library.returnBook(member1, book1);
        library.returnBook(member2, book2);
    }
}


