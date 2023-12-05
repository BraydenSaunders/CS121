package interfaces;

public class InteractableTest {
    public static void main(String[] args) {
        UserImplementingInteractable jack = new UserImplementingInteractable();
        AdminImplementingInteractable kim = new AdminImplementingInteractable();
        System.out.println(jack.Information());
        System.out.println(kim.Information());
    }
}
