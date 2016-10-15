package house;

 class House {

    public House(int apartmentsNumber, int square, int floor, int roomNumber, String street, String buildingType, int expluatationPeriod) {
        this.apartmentsNumber = apartmentsNumber;
        this.square = square;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.expluatationPeriod = expluatationPeriod;
    }

    @Override
    public String toString() {
        return "House{" + "apartmentsNumber=" + apartmentsNumber + ", square=" + square + ", floor=" + floor + ", roomNumber=" + roomNumber + ", street=" + street + ", buildingType=" + buildingType + ", expluatationPeriod=" + expluatationPeriod + '}';
    }
     
     private int apartmentsNumber;
     private int square;
     private int floor;
     private int roomNumber;
     private String street;
     private String buildingType;
     private int expluatationPeriod;

    public int getApartmentsNumber() {
        return apartmentsNumber;
    }

    public void setApartmentsNumber(int apartmentsNumber) {
        this.apartmentsNumber = apartmentsNumber;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getExpluatationPeriod() {
        return expluatationPeriod;
    }

    public void setExpluatationPeriod(int expluatationPeriod) {
        this.expluatationPeriod = expluatationPeriod;
    }
     
     
}
