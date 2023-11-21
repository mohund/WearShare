public class Beneficiary extends User{
    // Class fields
    private int weight;
    private int tall;
    private double shoesSize;
    private Clothes headClothes;

    // Constructor
    public Beneficiary(){
        super(1, "Bene", "1Bene", "X", "0000000000");
    }

    public Beneficiary(int ID, String name, String password, String location, String phoneNumber, int weight, int tall, double shoesSize, Clothes headClothes) {
        super(ID, name, password, location, phoneNumber);
        this.weight = weight;
        this.tall = tall;
        this.shoesSize = shoesSize;
        this.headClothes = headClothes;
    }

    // Print beneficiary information
    @Override
    public String toString() {
            // Imp
            return "";
        }

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

    
}
