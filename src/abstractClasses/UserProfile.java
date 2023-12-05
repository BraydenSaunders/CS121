package abstractClasses;

public class UserProfile extends User {
    private String profileMessage;
    public UserProfile(String Username, String Password, String profileMessage) {
        super(Username, Password);
        this.profileMessage = profileMessage;
    }
    public String getProfileMessage() {
        return profileMessage;
    }
    public void setProfileMessage(String profileMessage) {
        this.profileMessage = profileMessage;
    }
    @Override
    public String toString() {
        return String.format("Username: %s\nPassword: %s\nProfile Message: %s", getUsername(), getPassword(), getProfileMessage());
    }
    @Override
    public String UserInformation(){
        return profileMessage;
    }
}