package projectOne;

import java.util.Scanner;

public class CharacterBattle {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int roundCount = getRounds();
        int[] playerScores = new int[2];
        for (int num = 1; num <= roundCount; num++) {
            System.out.println("Round "+num+".");
            System.out.println("-------Player 1-------");
            character p1 = characterStats();
            System.out.println("-------Player 2-------");
            character p2 = characterStats();
            battle(p1, p2, playerScores);
        }
        System.out.println("Player 1 has "+playerScores[0]+" points.");
        System.out.println("Player 2 has "+playerScores[1]+" points.");
        if (playerScores[0] > playerScores[1]){
            System.out.println("\nPlayer 1 is the winner!");
        }
        if (playerScores[0] < playerScores[1]){
            System.out.println("\nPlayer 2 is the winner!");
        }
    }
    public static int[] battle(character p1, character p2, int[] playerPoints) {
        int hpLeftP1 = p1.getHitPoints();
        int hpLeftP2 = p2.getHitPoints();

        p1.setHitPoints(p1.getHitPoints(), hpLeftP1);
        p2.setHitPoints(p2.getHitPoints(), hpLeftP2);

        boolean p1Random = false;
        boolean p2Random = true;
        if (p1.getAttackSpeed() == p2.getAttackSpeed()) {
            if (Math.random() > .5) {
                p1Random = true;
            }
            if (Math.random() < .5){
                p2Random = false;
            }
        }
        if (p1.getAttackSpeed() > p2.getAttackSpeed() || p1Random) {
            System.out.println(p1.getName()+" attacks first and uses " + p1.getMove()+"!");
            hpLeftP2 -= p1.getDamage();
            System.out.println(p2.getName() +" has "+hpLeftP2+" HP left.");

            if (hpLeftP2 <= 0) {
                System.out.println(p1.getName()+" wins this round.");
                playerPoints[1]++;
            }
            else if (hpLeftP1 <= 0) {
                System.out.println(p2.getName()+" wins this round.");
                playerPoints[0]++;
            }
        }
        else if (p1.getAttackSpeed() < p2.getAttackSpeed() || p2Random) {
            System.out.println(p2.getName()+" attacks first and uses "+p2.getMove()+"!");
            hpLeftP1 -= p2.getDamage();
            System.out.println(p1.getName() +" has "+hpLeftP1+" HP left.");
            if (hpLeftP1 <= 0) {
                System.out.println(p2.getName()+" wins this round.");
                playerPoints[1]++;
            }
            else if (hpLeftP2 <= 0) {
                System.out.println(p1.getName()+" wins this round.");
                playerPoints[0]++;
            }
        }
        do {
            if (p1.getAttackSpeed() > p2.getAttackSpeed() ||p1Random) {
                System.out.println(p2.getName() + " uses " +p2.getMove()+ "!");
                hpLeftP1 -= p2.getDamage();
                System.out.println(p1.getName() + " has " +hpLeftP1+" HP left.");

                if (hpLeftP1 > 0) {
                    System.out.println(p1.getName() + " uses "+ p1.getMove() + "!");
                    hpLeftP2 -= p1.getDamage();
                    System.out.println(p2.getName() + " has "+ hpLeftP2 + " HP left.");
                }
                else{
                    if (hpLeftP1 < 0) {
                        System.out.println(p2.getName() + " wins this round.");
                        playerPoints[1]++;
                        break;
                    }
                    if (hpLeftP2 <= 0){
                        System.out.println(p1.getName()+" wins this round.");
                        playerPoints[0]++;
                        break;
                    }
                    else {
                        System.out.println(p2.getName() + " wins this round.");
                        playerPoints[1]++;
                        break;
                    }
                }
            }
            if (p1.getAttackSpeed() < p2.getAttackSpeed() || p2Random) {
                System.out.println(p1.getName() +" uses "+p1.getMove()+"!");
                hpLeftP2 -= p1.getDamage();
                System.out.println(p2.getName() +" has "+hpLeftP2+" HP left.");

                if (hpLeftP2 > 0) {
                    System.out.println(p2.getName() + " uses " + p2.getMove() + "!");
                    hpLeftP1 -= p2.getDamage();
                    System.out.println(p1.getName() + " has " + hpLeftP1 + " HP left.");

                }
                else {
                    if (hpLeftP1 <= 0){
                        System.out.println(p2.getName()+ " wins this round.");
                        playerPoints[1]++;
                        break;
                    }
                    if (hpLeftP2 < 0) {
                        System.out.println(p1.getName() + " wins this round.");
                        playerPoints[0]++;
                        break;
                    }
                    else{
                        System.out.println(p1.getName() + " wins this round.");
                        playerPoints[0]++;
                        break;
                    }
                }
            }
        }
        while (hpLeftP1 >= 0 && hpLeftP2 >= 0);
        return playerPoints;
    }
    public static int getRounds() {
        int rounds;
        while (true) {
            System.out.println("Enter an odd number of rounds");
            rounds = console.nextInt();
            if (rounds % 2 != 0) {
                if (rounds == 1 ) {
                    System.out.println("The match will be 1 round");
                    break;
                }
                else {
                    System.out.println("The match will be "+rounds+" rounds.");
                    break;
                }
            }
        }return rounds;
    }
    public static character characterStats(){

        System.out.println("Enter name:");
        console.nextLine();
        String Name = console.nextLine();

        System.out.println("Enter move name:");
        String moveName = console.nextLine();

        System.out.println("Enter hit-point count:");
        int hitPointCount = console.nextInt();

        System.out.println("Enter Damage count:");
        int damageCount = console.nextInt();

        System.out.println("Enter attack speed count:");
        int attackSpeedCount = console.nextInt();

        return new character(Name,moveName,hitPointCount,damageCount,attackSpeedCount);
    }
}