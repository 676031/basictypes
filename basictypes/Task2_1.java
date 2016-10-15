package basictypes;

public class Task2_1 {
    
    
    
    
    static public void main (String[] args){
             int z = 0;
             int x = 0;
             int y = 0;
             int q = 0;
             int w;
             int divide;
        for(int i = 0; i<101;i++){
               if(i%2 ==0) {
                z+=i;
                   
                System.out.println("Число кратное 2 - " + i);}
               if(i%3 ==0){
                 x+=i;  
                  System.out.println("Число кратное 3 - " + i );}
               if(i%5 ==0){
                   y+=i;
                  System.out.println("Число кратное 5 - " + i );}
               if(i%7 ==0){
                   q+=i;
                  System.out.println("Число кратное 7 - " + i );}
               
        }
        
        System.out.println("Сумма чисел кратных двум = " + z);
        System.out.println("Сумма чисел кратных трем = " + x);
        System.out.println("Сумма чисел кратных пяти = " + y);
        System.out.println("Сумма чисел кратных семи = " + q);
        w = z-q; 
        System.out.println("разность сумм последовательности чисел, кратных 7 и 2 : " + z + "-" + q + "=" + w);
        divide = x/y;
        System.out.println("отношение суммы чисел кратных 5 и 3 :" + divide);
        
    }}
