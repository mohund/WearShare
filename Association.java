public class Association extends User{
    
    
    private Clothes headClothes;

    public Association(int ID, String name, String password, String location, String phoneNumber, String info, User next, Clothes headClothes) {
        super(ID, name, password, location, phoneNumber, info, next);
        this.headClothes = headClothes;
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
