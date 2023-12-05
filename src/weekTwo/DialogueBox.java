package weekTwo;

import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog( null, name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog( null,"Your age is:" + age);

        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your GPA"));
        JOptionPane.showMessageDialog( null, "Your GPA is:" + gpa);
    }
}
