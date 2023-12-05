package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String Username = "Mantra";
        String Password = "Eulogy";

        String userName = JOptionPane.showInputDialog("Username: ");
        String passWord = JOptionPane.showInputDialog("Password: ");

        if (userName.equals(Username) && passWord.equals(Password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121!");
        }
        if (!userName.equals((Username))) {
            JOptionPane.showMessageDialog(null, "Your Username is Incorrect");
        }
        if (!passWord.equals(Password)){
            JOptionPane.showMessageDialog(null, "Your Password is Incorrect");
        }
        if (!userName.equals(Username) && !passWord.equals(Password)){
            JOptionPane.showMessageDialog(null, "Your Username and Password are Incorrect");
        }
    }
}