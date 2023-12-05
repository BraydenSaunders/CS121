package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String Planet = JOptionPane.showInputDialog(null,"Type a Planet!");
        String planetSize = "";
        String planetDistance = "";
        switch(Planet) {
            case "mercury":
                planetSize = "Size: 1,516 miles";
                planetDistance = "Distance from the Sun: 35,000,000 miles";
                break;
            case "venus":
                planetSize = "Size: 3,760 miles";
                planetDistance = "Distance from the Sun: 67,000,000 miles";
                break;
            case "earth":
                planetSize = "Size: 3,959 miles";
                planetDistance = "Distance from the Sun: 93,000,000 miles";
                break;
            case "mars":
                planetSize = "Size: 2,106 miles";
                planetDistance = "Distance from the Sun: 142,000,000 miles";
                break;
            case "jupiter":
                planetSize = "Size: 43,441 miles";
                planetDistance = "Distance from the Sun: 484,000,000 miles";
                break;
            case "saturn":
                planetSize = "Size: 36,184 miles";
                planetDistance= "Distance from the Sun: 889,000,000 miles";
                break;
            case "uranus":
                planetSize = "Size: 15,759 miles";
                planetDistance = "Distance from the Sun: 1,790,000,000 miles";
                break;
            case "neptune":
                planetSize = "Size: 15,299 miles";
                planetDistance = "Distance from the Sun: 2,880,000,000 miles";
                break;
            default:
                planetSize = "The planet you've entered is not present in the database. Please enter another planet in";
                planetDistance = "The planet you've entered is not present in the database. Please enter another planet in";
                break;
        }
        JOptionPane.showMessageDialog(null,planetSize);
        JOptionPane.showMessageDialog(null,planetDistance);
    }
}