package house;
import java.util.*;

public class HouseMethod {

    Scanner sc = new Scanner(System.in);

    private House[] hArray;

    HouseMethod(House[] hArray) {
        this.hArray = hArray;
    }

    public void userRoomNumber() {
        int userRoom;
        System.out.println("Поиск квартир с заданным числом комнат");
        userRoom = sc.nextInt();
        System.out.println(userRoom + "-комнатные кваритры");
        for (House h : hArray) {
            if (h.getRoomNumber() == userRoom) {
                System.out.println(h + "");
            }
        }
    }

    public void userRoomNumberAndFloor() {
        int userRoom;
        int minFloor;
        int maxFloor;
        System.out.println("Поиск квартир с заданным числом комнат");
        userRoom = sc.nextInt();
        System.out.println("Введите минимальный этаж");
        minFloor = sc.nextInt();
        System.out.println("Введите максимальный этаж");
        maxFloor = sc.nextInt();
        System.out.println(userRoom + "-комнатные кваритры" + ", в интервале этажей от" + minFloor + "до" + maxFloor);
        for (House h : hArray) {
            if (h.getRoomNumber() == userRoom) {
                if (h.getFloor() >= minFloor && h.getFloor() <= maxFloor) {
                    System.out.println(h + "_");
                }
            }
        }
    }

    public void userSquare() {
        int userSquare;
        System.out.println("Квартиры с заданной площадью");
        userSquare = sc.nextInt();
        System.out.println("Квартиры с площадью не меньше чем" + userSquare);
        for (House h : hArray) {
            if (h.getSquare() >= userSquare) {
                System.out.println(h + "_");
            }
        }

    }

}
