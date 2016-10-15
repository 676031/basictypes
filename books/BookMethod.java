package books;

import java.util.*;

public class BookMethod {
    Scanner sc = new Scanner(System.in);

    private Books[] bArray;

    BookMethod(Books[] bArray) {
        this.bArray = bArray;
    }

    public void lookAuthor() {
        String authorBooks;
        System.out.println("Поиск книги по автору: Введите автора");
        authorBooks= sc.nextLine();
        System.out.println("Книги " +authorBooks);
        for (Books b : bArray) {
            if (b.getAuthor().equalsIgnoreCase(authorBooks)) {
                System.out.println(b + " ");
            }
        }
    }
    public void lookPublisher() {
        String searchPublisher;
        System.out.println("Поиск книги по издательству: Введите желаемое издательство");
        searchPublisher= sc.nextLine();
        System.out.println("Книги издательсва" +searchPublisher);
        for (Books b : bArray) {
            if (b.getPublish().equalsIgnoreCase(searchPublisher)) {
                System.out.println(b + " ");
            }
        }
    }

    public void lookYear() {
        int searchYear;
        System.out.println("Поиск книг по году: Введите минимальный год издания");
        searchYear=sc.nextInt();
        System.out.println("Книги " + searchYear +" года и выше");
        for (Books b : bArray) {
            if (b.getYear()>= searchYear) {
                System.out.println(b + " ");
            }
        }
    }



}
