public class Association extends User{
    
    
    private Clothes headClothes;

    public Association(int ID, String name, String password, String location, String phoneNumber) {
        super(ID, name, password, location, phoneNumber);
        this.headClothes = new Clothes ();
    }

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
