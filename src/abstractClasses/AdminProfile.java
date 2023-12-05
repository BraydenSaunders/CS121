package abstractClasses;

public class AdminProfile extends User{
    private String adminMessage;
    public AdminProfile(String Username, String Password, String adminMessage) {
        super(Username, Password);
        this.adminMessage = adminMessage;
    }
    public String getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(String adminMessage) {
        this.adminMessage = adminMessage;
    }
    @Override
    public String toString(){
        return String.format("Username: %s\nPassword: %s\nAdmin Message: %s", getUsername(), getPassword(), getAdminMessage());
    }
    @Override
    public String UserInformation(){
        return adminMessage;
    }
}
