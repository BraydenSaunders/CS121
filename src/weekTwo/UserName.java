package weekTwo;

import javax.swing.*;

public class UserName {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What's your full name?");

        JOptionPane.showMessageDialog(null, name.toUpperCase());
        JOptionPane.showMessageDialog(null, name.toLowerCase());

        StringBuilder revName = new StringBuilder();
        for(int i = name.length() - 1; i >= 0; i--)
            revName.append(name.charAt(i));
        JOptionPane.showMessageDialog(null, revName.toString());
    }
}