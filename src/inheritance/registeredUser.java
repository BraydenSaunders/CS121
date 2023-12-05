package inheritance;

public class registeredUser extends User {
    int userID;

    public registeredUser(String userName, String password, String email, int UserID) {
        super(userName, password, email);
        this.userID = UserID;
    }

    public int getDateOfBirth() {
        return userID;
    }

    public void setDateOfBirth(int Userid) {
        this.userID = Userid;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nPassword: %s\nEmail: %s\n Date of Birth: %d", getUserName(), getPassword(), getEmail(), getDateOfBirth());
    }
}
