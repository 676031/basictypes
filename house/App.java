package house;
//6. House: id, Номер квартиры, Площадь, Этаж , Количество комнат, Улица, Тип здания, Срок эксплуатации.

public class App {
    public static void main(String[] args) {
        House h1 = new House ( 215 , 64 , 6 , 3 ,"Академика павлова ", "Pannel",1979);
        House h2 = new House ( 113 , 46 , 3 , 2 ,"Лермонтовская ", "Pannel",1986);
        House h3 = new House ( 215 , 72 , 5 , 3 ,"Пушкинская ", "Pannel",1993);
        House h4 = new House ( 200 , 133 , 21 , 6 ,"Наталии Ужвий ", "Brick",1969);
        House h5 = new House ( 666 , 96 , 13 , 5 ,"Катарская ", "Brick",2013);
        House h6 = new House ( 44 , 96 , 8 , 3 ,"Воронежская ", "Brick",2000);
        House h7 = new House ( 25 , 150 , 7 , 2 ,"Чернышевского ", "Brick",2013);
        House h8 = new House ( 315 , 88 , 4 , 6 ,"Чернышевского ", "Brick",2013);
        House h9 = new House ( 96 , 59 , 2 , 5 ,"Чернышевского ", "Brick",2013);
        House h10 = new House ( 69 , 200 , 1 , 4 ,"Чернышевского ", "Brick",2013);
        
        House[] hArray = {h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};
        for (House h: hArray)
            System.out.println(h);
        HouseMethod hm = new HouseMethod(hArray);
        hm.userRoomNumber();
        hm.userRoomNumberAndFloor();
        hm.userSquare();
}
}