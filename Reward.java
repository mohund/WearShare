public class Reward {
    private int ID;
    private int sumReward;

    // Constructor
    public Reward(int ID, int sumReward) {
        this.ID = ID;
        this.sumReward = sumReward;
    }

    public boolean addReward() {
        this.sumReward += 50;
        return true;
    }

    public boolean deleteReward() {
        this.sumReward -= 50;
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return "";
    }

    // Getter and setter methods
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSumReward() {
        return sumReward;
    }

    public void setSumReward(int sumReward) {
        this.sumReward = sumReward;
    }
}
