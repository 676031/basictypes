package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class Task3parallel {
    static String a;
    static String b;
    static String c;
    public static void main(String[] args) throws IOException{
        System.out.println("1 - Обьем параллелипипида, 2 - Площадь поверхности");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String user = br.readLine();
        if(user.equals("1")){
            System.out.println("Введите переменную a");
            String a = br.readLine();
            int x = Integer.parseInt(a);
            
            System.out.println("Введите переменную b");
            String b = br.readLine();
            int y = Integer.parseInt(b);
            
            System.out.println("Введите переменную c");
            String c = br.readLine();
            int z = Integer.parseInt(c);
            
            double V = x * y * z;
            System.out.println("Обьем параллелипипида = " + V);
   }
        if (user.equals("2"));
            System.out.println("Введите переменную a");
            String a = br.readLine();
            int x = Integer.parseInt(a);
            
            System.out.println("Введите переменную b");
            String b = br.readLine();
            int y = Integer.parseInt(b);
            
            System.out.println("Введите переменную c");
            String c = br.readLine();
            int z = Integer.parseInt(c);
            
            double S = 2 * (x*y + y*z + z*x);
            System.out.println("Площадь поверхности паралелипипеда = " + S);
}}
