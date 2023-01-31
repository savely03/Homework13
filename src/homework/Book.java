package homework;

public class Book {
    private static int idCnt; // Счетчик Id
    private final int id; // Id
    private final String title; // Название
    private final Author author; // Автор
    private int publicationYear; // Год публикации

    public Book(String title, Author author, int publicationYear) {
        this.id = ++idCnt;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
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


    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
