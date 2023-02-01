package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №13");
        Author kattySierra = new Author("Katty", "Sierra");
        Author bruceEckel = new Author("Bruce", "Eckel");
        Book learningJava = new Book("Learning Java", kattySierra, 2003);
        Book thinkingInJava = new Book("Thinking In Java", bruceEckel, 1998);
        learningJava.setPublicationYear(2015);
        printBooks(learningJava, thinkingInJava);
    }


    /**
     * Метод выводит список существующих книг
     *
     * @param books Массив книг
     */
    public static void printBooks(Book... books) {
        System.out.println("Книги:");
        for (Book book : books) {
            System.out.println(" " + book.getId() + ")" + book);
        }
    }
}