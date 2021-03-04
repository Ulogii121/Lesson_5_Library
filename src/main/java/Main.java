public class Main {
    public static void main(String[] args) {

        //Создаём массив книг
        Book first = new Book("Война и мир", "Толстой", 1, 895);
        Book second = new Book("Тихий Дон", "Шолохов", 2, 632);
        Book third = new Book("Преступление и наказание", "Достоевский", 436);
        Book fourth = new Book("Мертвые души", 123);
        Book Books[] = {first, second, third, fourth};

        //Читатель производит операции над книгами
        Reader reader = new Reader();
        reader.rateBook(Books);


    }


}
