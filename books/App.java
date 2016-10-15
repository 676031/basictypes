package books;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Books b1 = new Books(1, "Я такой как все", "Vitale Jo", "Ogonek", 2010, 130, 45, "Мягкий");
        Books b2 = new Books(2, "Париж", "Rezerford George", "Pechka", 2007, 130, 252, "Мягкий");
        Books b3 = new Books(3, "Зулейха открывает глаза", "Yahina Guzel", "Lopzter", 2002, 777, 15, "Твердый");
        Books b4 = new Books(4, "Как завоевать клиента", "Rafel Neil", "Ogonek", 2006, 113, 138, "Мягкий");
        Books b5 = new Books(5, "Развитие бизнеса", "Parabellum Andrew", "Snezhok", 2016, 130, 500, "Твердый");

        Books[] bArray = {b1, b2, b3, b4, b5};

        for (Books b : bArray)
            System.out.println(b);
        BookMethod bm = new BookMethod(bArray);
        bm.lookAuthor();
        bm.lookPublisher();
        bm.lookYear();
    }

}
