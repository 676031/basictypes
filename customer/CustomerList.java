package customer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class CustomerList {
   static private Customer[] customerlist;
    Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    CustomerList(Customer[] customerlist){
        this.customerlist = customerlist;
    }
    
public void printallcustomer(Customer[] customerlist){
    for (Customer i:customerlist){
        System.out.println(i);
    }
        
}
public void searchAlphabet(){
        String userAlphabet;
        System.out.println("Алфавитный порядок");
        userAlphabet = sc.nextLine();
        System.out.println("В алфавитном порядке" +userAlphabet);
        Arrays.sort(customerlist);
        for (Customer i:customerlist){
            System.out.println(i + " ");
        }
    }

 public static int checkNumber(int number){
     while(number<=999){
     number = r.nextInt(9999);
     }
     return number;
   }
    
    public void cardDiapason(){
      int from = checkNumber(r.nextInt(9999));
      int to = from + r.nextInt(9999-from);
    System.out.println("Клиенты с номером карты в диапазоне от " + from + " до "+ to);
    for(Customer c : customerlist){
            if(c.getCreditcard()>=from && c.getCreditcard()<=to){
                System.out.println(c);
            }
    }
}
}