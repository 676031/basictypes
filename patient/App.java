package patient;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        createPatient();
        patients();
        alphabetSort();
        findDiagnose();
        findMedCardDiapasone();
    }

    private static Patient[] patientArray = new Patient[5];
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    private static String[] ids = {
        "1", "2", "3", "4", "5"
    };
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
    private static String[] diagnoses = {
        "Zdorov", "Zdorov-pacan", "Bolen", "Bolen", "Shizofrenia"
    };

    public static void createPatient() {
        for (int i = 0; i < patientArray.length; i++) {
            Patient p = new Patient();
            p.setSurname(surnames[r.nextInt(patientArray.length)]);
            p.setName(names[r.nextInt(patientArray.length)]);
            p.setMiddleName(middleNames[r.nextInt(patientArray.length)]);
            p.setAdress(adresss[r.nextInt(patientArray.length)]);
            p.setPhone(checkNumber(r.nextInt(9999)));
            p.setMedCard(checkNumber(r.nextInt(9999)));
            p.setDiagnose(diagnoses[r.nextInt(patientArray.length)]);
            p.setId(i + 1);
            patientArray[i] = p;
        }
    }

    public static void patients() {
        for (Patient p : patientArray) {
            System.out.println(p + "_");
        }
    }

    public static int checkNumber(int num) {

        while (num <= 999) {
            num = r.nextInt(9999);
        }
        return num;
    }

    public static void alphabetSort() {
        Arrays.sort(surnames);
        System.out.println("Пациенты в алфавитном порядке");
        for (Patient p : patientArray) {
            System.out.println(p + "_");
        }
    }

    public static void findDiagnose() {
        String diagnose;
        System.out.println("Для поиска пациентов по диагнозу введите диагноз");
        diagnose = sc.nextLine();
        System.out.println("Пациенты с диагнозом : " + diagnose);
        for (Patient p : patientArray) {
            if (p.getDiagnose().equalsIgnoreCase(diagnose))
            System.out.println(p + "_");
        }
    }

//    public static void findMedCardDiapasone() {
//        int from = checkNumber(r.nextInt(9999));
//        int to = from + r.nextInt(9999 - from);
//        System.out.println("Пациенты с № мед карты от : " + from + " до : " + to);
//        for (Patient p : patientArray) {
//            if (p.getMedCard() >= from && p.getMedCard() <= to) {
//                System.out.println(p + "_");
//            }
//        }
//    }
    public static void findMedCardDiapasone() {
        int from;
        int to;
        System.out.println("Для поиска мед.карт пациентов в заданном диапазоне введите диапазон мед.карт");
        System.out.println("Введите от");
        from = sc.nextInt();
        System.out.println("Введите до");
        to = sc.nextInt();
        System.out.println("Пациенты с № мед карты от : " + from + " до : " + to);
        for (Patient p : patientArray) {
            if (p.getMedCard() >= from && p.getMedCard() <= to) {
                System.out.println(p + "_");
            }
        }
    }
    
}
