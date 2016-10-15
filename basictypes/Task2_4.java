package basictypes;

import java.util.Random;


public class Task2_4 {
    
    
    static public void main (String[] args){
        int d = 100;
        int [] massive = new int [10];
        Random r = new Random();
        int summ = 0;
        int index;
        for(int i = 0; i<massive.length;i++){
            massive[i] = r.nextInt(d);
            index = i;
            System.out.println(massive[i] +"["+ index +"]" );
            }
        
        System.out.println("Элементы массива в обратном порядке" + '\n');
        
        for(int y = massive.length-1; y >=0; y--){
           // index = y;
            System.out.println(massive[y] +"["+ y +"]" );
        }
        System.out.println("Четные элементы массива" + '\n');
        for(int k = 0; k<massive.length;k++){
           if (massive[k]%2==0)
            System.out.println(massive[k] + "[" + k + "]");
        }
        System.out.println("Нечетные элементы массива" + '\n');
        for(int k = 0; k<massive.length;k++){
           if (massive[k]%2!=0)
            System.out.println(massive[k] + "[" + k + "]");
             }
        System.out.println("Элементы кратные семи" + '\n');
        for(int k = 0; k<massive.length;k++){
           if (massive[k]%7==0)
        System.out.println(massive[k] + "[" + k + "]");
        }
        
        System.out.println("Сумма элементов кратных семи" + '\n');
        for(int k = 0; k<massive.length;k++){
           if (massive[k]%7==0)
               summ += k;
        System.out.println(summ);
        }
        
}}