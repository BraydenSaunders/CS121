import arrayListActivity.StringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList demo = new StringArrayList();

        demo.addScore(98);
        demo.addScore(87);
        demo.addScore(34);

        System.out.printf("Scores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores1();

        System.out.printf("%nScores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores2();

        System.out.printf("%nRemove first element %d%n", demo.getScore(0));
        demo.removeScore(0);
    }
}