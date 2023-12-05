package staticActivity;

public class Person {
    private String name;
    private int age;
    private double height;

    private static int instanceCount = 0;

    public Person(){
    }
    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;

        instanceCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void showDetails(){
        System.out.println("Your name is "+name+" and you're "+age+" years old. You currently stand at "+height+" feet");
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
}
