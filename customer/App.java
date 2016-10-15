package customer;


public class App {
    
    public static void main (String[] args){
        Customer c1 = new Customer("Kostileva" ,"Juli" , "Stanislavovna", "Korka 24" , 66627 , "13");
        Customer c2 = new Customer("Kolesnikov" ,"Romzes" , "Yonigovich", "Korka 25" , 666 , "777");
        Customer c3 = new Customer("Kostileva" ,"Evjenia" , "Stanislavovna", "Korka 22" , 1212 , "12");
        Customer c4 = new Customer("Kolesnikov" ,"Alexander" , "Yonigovich", "Yborevicha 126" , 4418 , "17");
        Customer c5 = new Customer("Grehovodov" ,"Bodya" ,"Alexandrovich" , "Svetlaja 44" , 1337 , "93");
        Customer [] customerlist = {
            c1,c2,c3,c4,c5
    };
    
    for (Customer i: customerlist)
            System.out.println(i);
    CustomerList cl = new CustomerList(customerlist);
    cl.searchAlphabet();
    cl.cardDiapason();
    }
}
