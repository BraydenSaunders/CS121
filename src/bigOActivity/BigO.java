package bigOActivity;

public class BigO {
    public void printOnce(){
        System.out.println("Number");
    }
    public void printNTimes(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Letter");
        }
    }
    public void printNSquaredTimes(int num){
        for (int i = 0; i < num; i++){
            for (int x = 0; x < num; x++) {
                System.out.println("Character");
            }
        }
    }
}
