public class Donor extends User {
    
    private Reward rewards;

    // Constructor
    public Donor(int ID, String name, String password, String location, String phoneNumber) {
        
        super(ID, name, password, location, phoneNumber);
        
    }

    public boolean addReward() {
        rewards.addReward();
        return true;
    }

    public boolean deleteReward() {
        rewards.deleteReward();
        return true;
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


