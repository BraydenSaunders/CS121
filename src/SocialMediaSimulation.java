import javax.swing.*;

public class SocialMediaSimulation {
    public static void main(String[] args) {
        int totalPosts = 2;
        String[][] posts = new String[totalPosts][];
        String[] postContent = new String[totalPosts];
        int[] postLikes = new int[totalPosts];
        int[] postComments = new int[totalPosts];

        for (int i = 0; i < totalPosts; i++) {
            postContent[i] = JOptionPane.showInputDialog("Post " + (i + 1) + " content");
            postLikes[i] = Integer.parseInt(JOptionPane.showInputDialog("Likes " + (i + 1)));
            postComments[i] = Integer.parseInt(JOptionPane.showInputDialog("Comments " + (i + 1)));
        }
        for (int i = 0; i < totalPosts; i++) {
            posts[i] = new String[]{postContent[i], String.valueOf(postLikes[i]), String.valueOf(postComments[i])};
        }
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f : posts) {
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }

        System.out.println("\nUpdate\n");
        for (int i = 0; i < totalPosts; i++) {
            postLikes[i] += Integer.parseInt(JOptionPane.showInputDialog("New Likes " + (i + 1)));
            postComments[i] += Integer.parseInt(JOptionPane.showInputDialog("New Comments " + (i + 1)));
        }
        for (int i = 0; i < totalPosts; i++) {
            posts[i][1] = String.valueOf(postLikes[i]);
            posts[i][2] = String.valueOf(postComments[i]);
        }
        System.out.printf("%-18s %-11s %4s\n", "Post Content", "Likes", "Comments");
        for (String[] f : posts) {
            System.out.printf("%-16s %2s %12s\n", f[0], f[1], f[2]);
        }
    }
}
