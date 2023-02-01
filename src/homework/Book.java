package homework;

import java.util.Objects;

public class Book {
    private static int idCounter; // Счетчик Id
    private final int id; // Id
    private final String title; // Название
    private final Author author; // Автор
    private int publicationYear; // Год публикации

    public Book(String title, Author author, int publicationYear) {
        this.id = ++idCounter;
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
        if (publicationYear < 1950 || publicationYear > 2023) {
            throw new IllegalArgumentException("Неверная дата публиции");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}
