package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2Circle {
    static String d;
    static String r;
    static String R;
    
    public static void main(String[] args) throws IOException{
        System.out.println("1 - длина окружности, 2- площадь окружности, 3 - площадь кольца");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String user = br.readLine();
        if (user.equals("1")){
            System.out.println("Введите переменную d");
            String d = br.readLine();
            int x = Integer.parseInt(d);
            
            double z = Math.PI * x;
            System.out.println("Длина окружности - " + z);
            }
        
        if (user.equals("2")){
            System.out.println("Введите радиус окружности r");
            String r = br.readLine();
            int q = Integer.parseInt(r);
            
            double s = Math.PI * Math.pow(q, 2);
            System.out.println("Площадь окружности - " + s);
        }
        if (user.equals("3")){
            System.out.println("Введите радиус описанной окружности R");
            String R = br.readLine();
            int w = Integer.parseInt(R);
            System.out.println("Введите радиус окружности r");
            String r = br.readLine();
            int o = Integer.parseInt(r);
            
            double g = Math.PI * (Math.pow(w, 2) - Math.pow(o, 2));
            System.out.println("Площадь кольца - " + g);
            
            
        }
    } 
}