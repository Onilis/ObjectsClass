class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear;
    }
}