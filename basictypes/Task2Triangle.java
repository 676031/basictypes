package basictypes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;




public class Task2Triangle {
    
   static int a;
   static int b;
   static int c;
   static int h;
     public static void main(String[] args) throws IOException{
         System.out.println("Периметр треугольника - 1; Периметр треугольника - 2");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String user = br.readLine();
    if (user.equals("1")){
             
        System.out.println("Введите переменную a");
        String a = br.readLine();
        System.out.println("Введите переменную b");
        String b = br.readLine();
        System.out.println("Введите перменную c");
        String c = br.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
       
        double j = (x + y + z)/2;
        System.out.println(j);}
        
    if (user.equals("2")){
       System.out.println("Введите переменную b");
        String b = br.readLine();
        System.out.println("Введите переменную h");
        String h = br.readLine();
        int m = Integer.parseInt(b);
        int e = Integer.parseInt(h);
        
        double f = (m*e)/2;
        System.out.println(f);
     }
     }
     
}