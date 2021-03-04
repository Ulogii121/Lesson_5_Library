public class Book {
    String title, author; //название, автор
    int number, page; //порядковый номер в серии, кол-во страниц

    Book(String title, String author, int number, int page) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.page = page;
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", number=" + number +
                ", page=" + page +
                '}';
    }
}
