package Students;

public class App {
    
   
    public static void main(String[] args){
        Students s1 = new Students("Romeo", "Koko", "Jucy", 1992, "Kh", "0679340100", "IF", 6, 11);
        Students s2 = new Students("Ramzan","Kolesnik","Yoniggovich", 1992,"Kharkiv rapa city","0679340199","SGT",6,10);
        Students s3 = new Students("Vitalik","Apple","Kitkat", 1998,"Kiev","0679340199","IF",6,7);
        Students s4 = new Students("Stepa","Blackberry","Bounty", 1990,"Mariupol","0679340199","EM",6,5);
        Students s5 = new Students("Rokoko","Samsung","Nuts", 1990,"Gorod kotoporo HET","0679340199","EM",6,2);
        
        Students[] studentList ={s1,s2,s3,s4,s5};
        
        for (Students i:studentList)
            System.out.println(i);
        StudentList sl = new StudentList(studentList);
        sl.printAllStudents(studentList);
        sl.searchFacultet();
        sl.searchYear();
        sl.searchGroup();
        sl.searchFacAndCourse("IF", 2);
    }
}