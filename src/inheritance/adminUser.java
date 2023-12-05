package inheritance;

public class adminUser extends User{
    boolean adminStatus;

    public adminUser(String userName, String password, String email, boolean AdminStatus) {
        super(userName, password, email);
        this.adminStatus = AdminStatus;
    }

    public boolean getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(boolean Adminstatus) {
        this.adminStatus = Adminstatus;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nPassword: %s\nEmail: %s\nAdmin Status: %b", getUserName(), getPassword(), getEmail(), getAdminStatus());
    }
}
