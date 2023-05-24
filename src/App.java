import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PrintMenu menu = new PrintMenu();
        menu.showMenu(new Scanner(System.in));
    }
}
