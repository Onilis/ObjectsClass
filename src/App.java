public class App {
    public static void main(String[] args) {
        Author author = new Author("Александр","Пушкин");
        Book book = new Book("Капитанская дочка",author,1834);
        book.setPublicationYear(1836);
        System.out.println(book);

        Author author1 = new Author("Лев","Толстой ");
        Book book1 = new Book("Война и мир",author1,1873);
        System.out.println(book1);
    }
}