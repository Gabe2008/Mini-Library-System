import org.w3c.dom.Text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FictionalBook book1 = new FictionalBook("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997, 250, "Fantasy");
        Manga book2 = new Manga("Naruto Volume 1", "Masashi Kishimoto", 1999, 192, "Action");
        Textbook book3 = new Textbook("Foundations of Microeconomics, 9th Edition", "Robin Bade, Michael Parkin", 2020, 600, "Microeconomics");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }
}