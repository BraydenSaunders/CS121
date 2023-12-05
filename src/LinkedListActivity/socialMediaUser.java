package LinkedListActivity;

import java.util.LinkedList;
public class socialMediaUser {
    private String Username, Email, Bio, phoneNumber;
    private LinkedList<String>messageList;
    public socialMediaUser(String username, String email, String bio, String PhoneNumber, LinkedList<String>messageList){
        this.Username = username;
        this.Email = email;
        this.Bio = bio;
        this.phoneNumber = PhoneNumber;
        this.messageList = messageList;
    }
    public void addMessage(String Message){
        this.messageList.add(Message);
    }
    public void removeMessage(int i){
        this.messageList.remove(i);
    }
    public String getUserInfo(){
        return String.format("Username: %s\nEmail: %s\nBio: %s\nPhone Number: %s", Username, Email, Bio, phoneNumber, messageList);
    }
    public void displayUserMessage(){
        System.out.printf("Messages: %s\n", messageList);
    }
}
