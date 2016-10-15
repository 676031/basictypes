package basictypes;

//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class Task3Ball {
    String D;
    public static void main(String[] args) throws IOException{
        System.out.println("1 - Найти площадь поверхности шара (S), 2 - найти обьем шара (V)");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String user = br.readLine();
        if(user.equals("1")){
            System.out.println("Введите диаметр шара (D)");
            String D = br.readLine();
            int x = Integer.parseInt(D);
            double S = Math.PI * Math.pow(x, 2);
            System.out.println("Площадь шара = " + S);
        }
        if(user.equals("2")){
            System.out.println("Введите диаметр шара(D)");
            String D = br.readLine();
            int y = Integer.parseInt(D);
            
            double z = Math.PI * Math.pow(y, 3) / 6;
            System.out.println("Обьем шара = " + z);
        }
    }
    
}