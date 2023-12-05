package LinkedListActivity;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>user1 = new LinkedList<>();
        LinkedList<String>user2 = new LinkedList<>();

        socialMediaUser someone = new socialMediaUser("Someone24", "someonesEmail@gmail.com", "902-238-3871", "This is my bio!", user1);
        socialMediaUser someonesElse = new socialMediaUser("SomeoneElse42", "someoneElsesEmail@gmail,com", "This is his bio", "178-383-2209", user2);

        System.out.println("Someone");
        someone.addMessage("Heyo");
        someone.addMessage("Hey");
        someone.addMessage("Are you gonna respond?");
        someone.addMessage("Please respond");

        System.out.println(someone.getUserInfo());
        System.out.println();
        someone.displayUserMessage();

        System.out.println();

        someone.removeMessage(2);
        someone.displayUserMessage();

        System.out.println();
        System.out.println("Someone else");
        someonesElse.addMessage("Yes");
        someonesElse.addMessage("Yeppers");
        someonesElse.addMessage("Why ask?");
        someonesElse.addMessage("Absolutely not!");

        System.out.println(someonesElse.getUserInfo());
        System.out.println();
        someone.displayUserMessage();

        System.out.println();

        someonesElse.removeMessage(1);
        someonesElse.displayUserMessage();


    }
}
