package weekTwo;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What's your name?");

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        String city = JOptionPane.showInputDialog("Where do you come from?");

        String college = JOptionPane.showInputDialog("Where did you go to college?");

        String animalType = JOptionPane.showInputDialog("What type of animal is your pet?");

        String animalName = JOptionPane.showInputDialog("And what's their name?");

        System.out.println("There was once a person named " + name + " and they were " + age + " years old.\n They lived in "  + city + " and they currently go to " + college + " while having a pet named " + animalName + " living with them. \nThey love their " + animalType + " and with " + animalName + "'s support, the student.json finds a way to get through the tough days ahead at " + college + ".");

    }
}
