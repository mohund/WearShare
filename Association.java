public class Association extends User{
    // Class fields
    private Clothes headClothes;

    // Constructor
    public Association(){
        this(1, "Ass", "1Ass", "X", "0000000000");
    } 

    public Association(int ID, String name, String password, String location, String phoneNumber) {
        super(ID, name, password, location, phoneNumber);
        this.headClothes = new Clothes();
    }

    // Print association information
    @Override
    public String toString() {
        // Imp
        return "";
    }

    public Clothes getHeadClothes() {
        return headClothes;
    }

    public void setHeadClothes(Clothes headClothes) {
        this.headClothes = headClothes;
    }
}
