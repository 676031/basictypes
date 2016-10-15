package basictypes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3TetraEdra {
    static String a;
    static String b; 
    static String c;
    static String d;
    static String h;
    
    public static void main(String[] args) throws IOException{
        System.out.println("Нахождение площади тетраэдры:");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Введите длину ребра тетраэдра (a)");
            String a = br.readLine();
            int x = Integer.parseInt(a);
            double z = Math.sqrt(3 * Math.pow(x, 2));
            System.out.println("Площадь тетраэдра = " + z);
            System.out.println("Хотите ли вы найти обьем тетраэдры?");
            String user = br.readLine();
            if (user.equals("1")){
                System.out.println("Введите высоту тетраэдры (h)");
                String h = br.readLine();
                int y = Integer.parseInt(h);
                double j =1/3;
                double o =j * y * z ;
                System.out.println("Обьем тетраэдры = " + o);
            }
            
            if(user.equals("2")){
                br.close();
            }
        }
    }