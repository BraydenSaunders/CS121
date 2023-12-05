package jsonActivity;

public class JSONStudent {
    String name;
    int ID;
    String major;
    public JSONStudent(String name, int ID, String major) {
        this.name = name;
        this.ID = ID;
        this.major = major;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public String getMajor() {
        return major;
    }
}
