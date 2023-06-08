package HWClass28;

import java.util.Scanner;

public class Task2 {
    public static void checkUserName() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter username");
            String name = scanner.nextLine();
            if (name.length()<5) {
                throw new RuntimeException();
            } else {
                System.out.println("Username valid");
            }
        }
        catch (RuntimeException e) {
            System.out.println("Exception occured: ");
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        checkUserName();
    }
}
