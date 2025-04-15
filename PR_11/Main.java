package PR_11;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("== ВИБІР ОПЕРАЦІЙ У БІБЛІОТЕЦІ ==");

        System.out.println("\n[ОПЕРАЦІЯ 1] Додавання книг:");
        library.addBook("Місто", "Валер’ян Підмогильний");
        library.addBook("Тіні забутих предків", "Михайло Коцюбинський");
        library.addBook("Зачарована Десна", "Олександр Довженко");
        library.addBook("Інтерстеллар", "Кіп Торн");

        System.out.println("\n[ОПЕРАЦІЯ 2] Відображення всіх книг:");
        library.displayBooks();

        System.out.println("\n[ОПЕРАЦІЯ 3] Сортування книг за назвою:");
        library.sortBooks();
        library.displayBooks();

        System.out.println("\n[ОПЕРАЦІЯ 4] Фільтрація книг за автором (містить 'Коцюбинський'):");
        library.filterBooks(new BookFilter() {
            @Override
            public boolean filter(Library.Book book) {
                return book.getAuthor().contains("Коцюбинський");
            }
        });

        System.out.println("\n== КІНЕЦЬ ПРОГРАМИ ==");
    }
}
