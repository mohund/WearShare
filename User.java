public class User implements LinkedListNode<User>{
    // Class fields
    protected int ID;
    protected String name;
    protected String password;
    protected String location;
    protected String phoneNumber;
    protected String info;
    protected User next;

    // Constructor
    public User(int ID, String name, String password, String location, String phoneNumber, String info, User next) {
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.info = info;
        this.next = next;
    }

    public boolean login(User headES, String userName, String password) {
        // Imp
        return false;
    }

    // toString method
    public String toString() {
        // Imp
        return "";
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
