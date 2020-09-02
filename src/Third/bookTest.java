package Third;
import java.lang.*;
public class bookTest {
    public static void main(String[] args) {
        book d1 = new book("Joan Rowling", "Harry Potter", 512);
        book d2 = new book("Agatha Christie", "Killing in the Order express", 750);
        book d3 = new book("Athur Conan Doyle", "Sherlock Holmes", 567);
        d3.setDescription("Bruh");
        System.out.print("first book: ");System.out.println(d1);
        d2.setAuthorName("Dan Brown");
        System.out.print("second book: ");System.out.print(d2);
    }
}
