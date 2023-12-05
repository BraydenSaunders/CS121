package setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class socialMediaFollowersSet {
    Scanner console = new Scanner(System.in);
    Set<String> followers = new HashSet<>();
    public void addFollowers(){
        System.out.println("Enter Username");
        String username = console.nextLine();
        while (!username.equals("0")) {
            followers.add(username);
            System.out.println("Enter Username");
            username = console.nextLine();
        }
    }
    public void displayFollowers(){
        Iterator<String> read = followers.iterator();
        while (read.hasNext()){
            String follower = read.next();;
            System.out.println(follower);
        }
    }
}
