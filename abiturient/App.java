package abiturient;

import java.util.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        createAbiturient();
        abiturients();
        badMarks();
        searchMarks();
        bestAbiturient();
    }

    private static Abiturient[] abiturientArray = new Abiturient[5];
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    
    private static String[] surnames = {
        "Kolesnikov", "Grehovodov", "Kostileva", "Alyohin", "Nikitin"
    };
    private static String[] names = {
        "Roman", "Bogdan", "Juli", "Igor", "Kirill"
    };
    private static String[] middleNames = {
        "Yurievich", "Aleksandrovich", "Olegovna", "Stanislavovich", "Artemovich"
    };
    private static String[] adresss = {
        "Ak.Pavlova 524", "Novgorodskaya 228", "Svetlaya 13", "Shironincev 37", "Pobedy 148"
    };
    private static String[] phones = {
        "0509278458", "0509278213", "0509278499", "0509278456", "0509270980"
    };

    public static void createAbiturient() {
        for (int i = 0; i < abiturientArray.length; i++) {
            Abiturient a = new Abiturient();
            a.setSurname(surnames[r.nextInt(abiturientArray.length)]);
            a.setName(names[r.nextInt(abiturientArray.length)]);
            a.setMiddleName(middleNames[r.nextInt(abiturientArray.length)]);
            a.setAdress(adresss[r.nextInt(abiturientArray.length)]);
            a.setPhone(phones[r.nextInt(abiturientArray.length)]);
            a.setHistory(checkMark(r.nextInt(12)));
            a.setMath(checkMark(r.nextInt(12)));
            a.setEnglish(checkMark(r.nextInt(12)));
            a.setId(i + 1);
            abiturientArray[i] = a;
        }
    }

    public static int checkMark(int num) {
        while (num <= 1) {
            num = r.nextInt(12);
        }
        return num;
    }

    public static void abiturients() {
        for (Abiturient a : abiturientArray) {
            System.out.println(a + "\t");
        }
    }

    public static void badMarks() {
        for (Abiturient a : abiturientArray) {
            System.out.println("Список абитуриентов с плохими оценками");
            if (a.getHistory() < 6 && a.getMath() < 6 && a.getEnglish() < 6) {
                System.out.println(a + "Bad marks");
            }
        }
    }

    public static void searchMarks() {
        int sum;
        System.out.println("Для поиска студентов с суммой баллов введите желаемую сумму баллов");
        sum = sc.nextInt();
        System.out.println("Абитуренты с суммой баллов выше " + sum + "и");
        for (Abiturient a : abiturientArray) {
            if (a.getHistory() + a.getMath() + a.getEnglish() > sum) {
                System.out.println(a + " ");
            }
        }
    }
    
//    public static void bestAbiturient() {
//        
//        Arrays.sort(abiturientArray);
//        System.out.println("Пациенты в алфавитном порядке");
//        for (Abiturient a : abiturientArray) {
//            System.out.println(a + "_");
//        }  
//    }

//    public static void bestAbiturient(Abiturient[] abiturientArray) {
//        //int question;
//        System.out.println("Сколько нужно абитурентов с лучшими оценками");
//        //question = sc.nextInt();
//        for (int i = abiturientArray.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (abiturientArray[j].getEnglish() + abiturientArray[j].getHistory() + abiturientArray[j].getMath() 
//                 > abiturientArray[j + 1].getMath()+ abiturientArray[j].getHistory()+abiturientArray[j].getEnglish()) {
//                    Abiturient tmp = abiturientArray[j];
//                    abiturientArray[j] = abiturientArray[j + 1];
//                    abiturientArray[j + 1] = tmp;
//                }
//                    System.out.println(abiturientArray[j] +"");
//            }
//        }
//    }
    
    
    
    
    public static void bestAbiturient() {
        int question;
        System.out.println("Сколько нужно абитурентов с лучшими оценками");
        question = sc.nextInt();
        int summ;
        int temp = 0;
        for (Abiturient a : abiturientArray) {
            summ = a.getEnglish() + a.getHistory() + a.getMath();
 
            do{
            if (summ > temp) {
                temp = summ;}
            }
        while (temp < question);
            System.out.println(temp + " ");
        }
    }
}