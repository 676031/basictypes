package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2Rectangular {
    static String a;
    static String b;
    static String d;
    
    public static void main (String[] args) throws IOException{
        System.out.println("Периметр прямоугольника - 1,Площадь прямоугольника -2");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String user = br.readLine();
    
    if (user.equals("1")){
        System.out.println("Введите переменную a");
        String a = br.readLine();
        int x = Integer.parseInt(a);
        System.out.println("Введите переменную b");
        String b = br.readLine();
        int y = Integer.parseInt(b);
        double z = 2 * (y + x);
        System.out.println("Периметр прямоугольника - " + z);
        
    }
    if (user.equals("2")){
        System.out.println("Введите переменную a ");
        String a = br.readLine();
        System.out.println("Введите переменную d ");
        String d = br.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(d);
        double z = x * Math.sqrt(Math.pow(y, 2)- Math.pow(x, 2));
        System.out.println("Площадь прямоугольника - " + z);
    }
    }
}
