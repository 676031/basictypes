
package Students;

import java.util.Scanner;


public class StudentList {
    private Students[] studentlist;
    Scanner sc = new Scanner(System.in);
    
    StudentList(Students[] studentlist){
        this.studentlist = studentlist;
    }
    
    public void printAllStudents(Students [] studList){
        for (Students i:studentlist){
                System.out.println(i);
        } 
        
    }
    
    public void searchFacultet(){
        String UserFacultet;
        System.out.println("Введите факультет");
        UserFacultet = sc.nextLine();
        System.out.println("Студенты факультета " + UserFacultet);
        for (Students i:studentlist){
            if (i.getFacultet().equalsIgnoreCase(UserFacultet))
                System.out.println(i);
        }
    }
    
    
    public void searchYear(){
        int userYear;
        System.out.println("Введите минимальный год рождения");
        userYear = sc.nextInt();
        System.out.println("Студенты чей год рождения больше чем" + userYear);
        for(Students i:studentlist){
            if (i.getBday()> userYear)
                System.out.println(i);
        }
    }
    public void searchGroup(){
        int userGroup;
        System.out.println("Введите группу");
        userGroup = sc.nextInt();
        System.out.println("Студенты группы" +userGroup);
        for (Students i:studentlist){
            if (i.getGroup() == userGroup)
                System.out.println(i);
        }
    }
    public void searchFacAndCourse(String fak, int cours){
        System.out.println("Студенты факультета"+ fak +"группы" + cours);
        
        for (Students i:studentlist){
            if (i.getFacultet().equalsIgnoreCase(fak) && i.getCourse() == cours){
                System.out.println(i);
            }
            else {
              System.out.println("Таких студентов нету"); break;
           }
        }
    }
}
