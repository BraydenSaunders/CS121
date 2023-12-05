package abstractClasses;

public abstract class User {
    private String username, password;
    public User(String Username, String Password){
        this.username = Username;
        this.password = Password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return String.format("Username: %s\nPassword: %s", username, password);
    }
    public abstract String UserInformation();
}
