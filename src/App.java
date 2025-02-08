import static java.io.IO.print;

public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Капитанская дочка", author1, 1834);
        book1.setPublicationYear(1836);
        System.out.println(book1);

        Author author = new Author("Лев", "Толстой");
        Book book = new Book("Война и мир", author, 1869);

        System.out.println(book);

        Book anotherBook = new Book("Война и мир", author, 1869);
        System.out.println(book.equals(anotherBook));

        System.out.println(book.hashCode() == anotherBook.hashCode());

        Book anotherBook1 = new Book("Капитанская дочка", author1, 1834);
        System.out.println(book1.equals(anotherBook1));

        System.out.println(book1.hashCode() == anotherBook1.hashCode());
    }
}