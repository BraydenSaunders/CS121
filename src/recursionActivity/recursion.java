package recursionActivity;

public class recursion {
    public void countDowm(int number){
        if (number == 0){
           System.out.print("Blast Off!");
        }
        else{
            System.out.print(number + "...");
            countDowm(number - 1);
        }
    }
    public void alphaBackwards(char letter){
        if (letter == 'a'){
            System.out.print(letter);
        }
        else{
            System.out.print(letter + " ");
            alphaBackwards((char)(letter - 1));
        }
    }
}
