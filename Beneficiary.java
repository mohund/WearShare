public class Beneficiary extends User{
    
    private int weight;
    private int tall;
    private double shoesSize;
    private Clothes headClothes;

    // with date
    //     public Beneficiary(int ID, String name, String password, String location, String phoneNumber, String info, User next, Date birthDate, int weight, int tall, double shoesSize, Clothes headClothes) {
    public Beneficiary(int ID, String name, String password, String location, String phoneNumber, String info, User next, int weight, int tall, double shoesSize, Clothes headClothes) {
        super(ID, name, password, location, phoneNumber, info, next);
        this.weight = weight;
        this.tall = tall;
        this.shoesSize = shoesSize;
        this.headClothes = headClothes;
    }

/*
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
*/
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public double getShoeSize() {
        return shoesSize;
    }

    public void setShoeSize(double shoesSize) {
        this.shoesSize = shoesSize;
    }

    public String toString() {
        // Imp
        return "";
    }
}
