package interfaces;

public class AdminImplementingInteractable implements Interactable {
    public String Information(){
        int users = (int)(Math.random()*10000);
        return String.format("Number of Users: %d", users);
    }

}
