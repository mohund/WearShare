public class Donor extends User {
    
    private Reward rewards;

    // Constructor
    public Donor(int ID, String name, String password, String location, String phoneNumber, String info, User next) {
        
        super(ID, name, password, location, phoneNumber, info, next);

    }

    public boolean addReward() {
        // Imp
        return false;
    }

    public boolean deleteReward() {
        // Imp
        return false;
    }

    public String toString() {
        // Imp
        return "";
    }

    // Getter and setter methods

    public Reward getRewards() {
        return rewards;
    }

    public void setRewards(Reward rewards) {
        this.rewards = rewards;
    }


}


