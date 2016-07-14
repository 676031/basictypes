package basictypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class Task3Cylinder {
    static String r;
    static String H;
    static String a;
    static String r1;
    static String r2;
    public static void main(String[] args) throws IOException{
        System.out.println("1- обьем цилиндра, 2 - обьем полого цилиндра, 3 - площадь боковой поверхности цилиндра (не полого)");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String user = br.readLine();
        if(user.equals("1")){
            System.out.println("Введите радиус окружности (r)");
            String r = br.readLine();
            int x = Integer.parseInt(r);
            
            System.out.println("Введите высоту (H)");
            String H = br.readLine();
            int z = Integer.parseInt(H);
            
            double V = Math.PI * Math.pow(x, 2) * z;
            System.out.println("Обьем  цилиндра = " + V);
            }
        if(user.equals("2")){
            System.out.println("Введите высоту полого цилиндра(H)");
            String H = br.readLine();
            int x = Integer.parseInt(H);
            System.out.println("Введите радиус (r1)");
            String r1 = br.readLine();
            int y = Integer.parseInt(r1);
           System.out.println("Введите радиус (r2)");
            String r2 = br.readLine();
            int z = Integer.parseInt(r2);
            double V = Math.PI * x *(Math.pow(y, 2)-Math.pow(z, 2));
            System.out.println("Обьем полого цилиндра = " + V);
            }
        if (user.equals("3"));
        System.out.println("Введите высоту цилиндра(H)");
        String H = br.readLine();
        int x = Integer.parseInt(H);
        
        System.out.println("Введите радиус цилиндра(r1)");
        String r1 = br.readLine();
        int y = Integer.parseInt(r1);
        
        System.out.println("Введите радиус цилиндра(r2)");
        String r2 = br.readLine();
        int z = Integer.parseInt(r2);
        
        double Sbok = 2* Math.PI * x * (y+z);
        System.out.println("Площадь боковой поверхности цилиндра (не полого) = " + Sbok );
        
    }
    
}