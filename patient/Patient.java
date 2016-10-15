package patient;

public class Patient implements Comparable<Patient> {

    public Patient(int id, String surname, String name, String middleName, String adress,
            int phone, int medCard, String diagnose) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phone = phone;
        this.medCard = medCard;
        this.diagnose = diagnose;
    }

    Patient() {
    }

    @Override
    public String toString() {
        return "ID" + id + ", Фамилия=" + surname + ", Имя=" + name + ", Отчество=" + middleName
                + ", Адрес=" + adress + ", Мобильный номер=" + phone + '№' + " Медкарты=" + medCard + ", Диагноз=" + diagnose;
    }
    private int id = 1;
    private String surname;
    private String name;
    private String middleName;
    private String adress;
    private int phone;
    private int medCard;
    private String diagnose;

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public int compareTo(Patient p) {
        return surname.compareToIgnoreCase(p.surname);
    }
}
