package abstractClasses;

public class UserTest {
    public static void main(String[] args) {
        UserProfile John = new UserProfile("KingJohn", "cake4Life", "I love me some cake!");
        AdminProfile Tim = new AdminProfile("IG444666", "hustle4Progress", "I don't talk much");
        System.out.printf("User Profile Message: %s\n", John.UserInformation());
        System.out.printf("Admin Message: %s\n", Tim.UserInformation());
    }
}