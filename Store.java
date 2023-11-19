public class Store extends User{

    private String promotions;
    private String code;
    

    // Constructor
    public Store(int ID, String name, String password, String location, String phoneNumber, String info, User next, String promotions, String code) {
        super(ID, name, password, location, phoneNumber, info, next);
        this.promotions = promotions;
        this.code = code;
    }

    public Store searchById(User headES, int ID) {
        // Imp
        return null;
    }

    public Store searchById(User headES, String name) {
        // Imp
        return null;
    }

    public String toString() {
        // Imp
        return "";
    }

    // Getter and setter methods

    public String getPromotions() {
        return promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
