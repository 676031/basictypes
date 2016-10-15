
package abiturient;

public class Abiturient implements Comparable<Abiturient> {

    @Override
    public String toString() {
        return "Абитуриент" + "id=" + id + ", surname=" + surname + ", name=" + name + ", middleName=" 
                + middleName + ", adress=" + adress + ", phone=" + phone + ", history=" + history + ", math=" 
                + math + ", english=" + english;
    }

    public Abiturient(String surname, String name, String middleName, String adress, String phone, int history, int math, int english) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phone = phone;
        this.history = history;
        this.math = math;
        this.english = english;
        this.summ=english+math+history;
    }


    
    private int id = 1;
    private String surname;
    private String name;
    private String middleName;
    private String adress;
    private String phone;
    private int summ;
    private int history;
    private int math;
    private int english;
    
    Abiturient() {
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Abiturient a) {
        return this.summ - a.summ;
    }

    
}
