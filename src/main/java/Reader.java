import java.util.Random;

class Reader {

    //Выбираем конкретную книгу из массива книг
    Book choiceBook(Book Books[]) {
        Random random = new Random();
        final int i = random.nextInt(Books.length);
        //System.out.println(Books[i]); //Для проверки
        return (Books[i]);
    }

    //Читаем выбранную книгу
    Book readBook(Book Books[]) {
        Book myChoice = choiceBook(Books);
        System.out.println(myChoice.title);
        return (myChoice);
    }

    //Оцениваем выбранную книгу
    void rateBook(Book Books[]) {
        Book myBook = readBook(Books);
        int a, b, c, d, rate;
        //Определяем значения количества символов
        if (myBook.title == null) {
            a = 0;
        } else {
            a = myBook.title.length();
        }
        if (myBook.author == null) {
            b = 0;
        } else {
            b = myBook.author.length();
        }
        c = myBook.number;
        d = myBook.page;
        //Считаем оценку
        rate = a / 2 + b / 2 - c + d;
        //Коррекция на пустые поля
        Random random = new Random();
        if (a == 0) {
            rate = rate - random.nextInt(10);
        }
        if (b == 0) {
            rate = rate - random.nextInt(10);
        }
        if (c == 0) {
            rate = rate - random.nextInt(10);
        }
        if (d == 0) {
            rate = rate - random.nextInt(10);
        }
        //System.out.println(a); //Для проверки
        //System.out.println(b); //Для проверки
        //System.out.println(c); //Для проверки
        //System.out.println(d); //Для проверки
        System.out.println(rate);
    }

}

