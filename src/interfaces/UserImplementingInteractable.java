package interfaces;

public class UserImplementingInteractable implements Interactable {
    public String Information(){
        int likeOnPost = (int)(Math.random()*10);
        int comments = (int)(Math.random()*10);
        return String.format("Number of likes on Post: %d\nNumber of Comments on Post: %d", likeOnPost, comments);
    }

}
