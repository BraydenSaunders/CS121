package ArraysActivity;

import javax.swing.*;

public class ArrayFromInput {
    public static void main(String[] args) {
        String[] Username = new String[3];
        int[] Password = new int[3];
        int[] Followers = new int[3];
        for (int num = 0; num < 3; num++){
            Username[num] = JOptionPane.showInputDialog("Enter username for user " +(num + 1) + ":");
            JOptionPane.showMessageDialog(null, Username[num]);
            Password[num] = Integer.parseInt(JOptionPane.showInputDialog("Enter password user " +(num + 1) + ":"));
            JOptionPane.showMessageDialog(null, Password[num]);
            Followers[num] = Integer.parseInt(JOptionPane.showInputDialog("Enter the number followers for user " +(num + 1) + ":"));
            JOptionPane.showMessageDialog(null, Followers[num]);
        }
        System.out.println("-------User data-------");
        System.out.println("Username:\t\t\tPassword:\t\tNumber of followers:\t\t\t");
        for (int num = 0; num < Followers.length; num++){
            System.out.println(Username[num] + "\t\t\t" + Password[num] +"\t\t\t" + Followers[num] + "\t\t\t");
        }
    }
}
