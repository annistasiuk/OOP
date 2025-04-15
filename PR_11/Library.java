package PR_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayInfo() {
            System.out.println("Назва: " + title + ", Автор: " + author);
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void displayBooks() {
        System.out.println("Усі книги у бібліотеці:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
        System.out.println("Книги відсортовано за назвою.");
    }

    public void filterBooks(BookFilter filter) {
        System.out.println("Результат фільтрації:");
        for (Book book : books) {
            if (filter.filter(book)) {
                book.displayInfo();
            }
        }
    }
}
