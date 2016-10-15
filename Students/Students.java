package Students;

public class Students {
    private String name;
    private String surname;
    private String secondname;
    private int bday;
    private String adress;
    private String phone;
    private String facultet;
    private int course;
    private int group;
 
    public void show(){
        System.out.println("Имя: " +getName() +" " +"Фамилия: " +getSurname() +" " +"Отчество: " +getSecondname() +" "
                +"Дата Рождения: "+getBday() +" " +"Адрес: "+getAdress() +" " +"Номер: "+getPhone() +" " 
                +"Факультет: "+getFacultet() +" " +"Курс: "+getCourse() +" " +"Группа: "+getGroup() +" " );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getBday() {
        return bday;
    }

    public void setBday(int bday) {
        this.bday = bday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Students(String name, String surname, 
            String secondname, int bday, String adress, String phone, String facultet, int course, int group) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.bday = bday;
        this.adress = adress;
        this.phone = phone;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Студенты : " + "Имя :" + name + ", Фамилия :" + surname +  
                ", Отчество :" + secondname + ", Год рождения :" + bday + 
                ", Адрес :" + adress + ", Телефон :" + phone + ", Факультет :" 
                + facultet + ", Курс :" + course + ", Группа :" + group;
    }
    
    
    
    
}