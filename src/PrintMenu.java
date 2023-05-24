import java.util.Scanner;

public class PrintMenu {
    void showMenu(Scanner sc) {
        System.out.println("Vui lòng lựa chọn các số từ 1 đến 6");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Input student");
                break;
            case 2:
                System.out.println("Show all list student");
                break;
            case 3:
                System.out.println("Displays the average score of the gradual list of students");
                break;
            case 4:
                System.out.println("Search course of all student");
                break;
            case 5:
                System.out.println("Search and show id of a student");
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Exeption");
                break;
        }
    }
}
