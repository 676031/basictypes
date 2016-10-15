package customer;

public class Customer implements Comparable<Customer>{

    public Customer(String Surname, String Name, String Secondname, String Address, int Creditcard, String Banknuber) {
        this.Surname = Surname;
        this.Name = Name;
        this.Secondname = Secondname;
        this.Address = Address;
        this.Creditcard = Creditcard;
        this.Banknuber = Banknuber;
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Customer" + "Surname=" + Surname + ", Name=" + Name + ", Secondname=" 
                + Secondname + ", Address=" + Address + ", Creditcard=" + Creditcard + ", Banknuber=" + Banknuber + '}';
    }
    private String Surname;
    private String Name;
    private String Secondname;
    private String Address;
    private int Creditcard;
    private String Banknuber;

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String Secondname) {
        this.Secondname = Secondname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getCreditcard() {
        return Creditcard;
    }

    public void setCreditcard(int Creditcard) {
        this.Creditcard = Creditcard;
    }

    public String getBanknuber() {
        return Banknuber;
    }

    public void setBanknuber(String Banknuber) {
        this.Banknuber = Banknuber;
    }

    @Override
    public int compareTo(Customer o) {
      return Surname.compareToIgnoreCase(o.Surname);
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
