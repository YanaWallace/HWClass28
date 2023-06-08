package HWClass28;

import java.util.Scanner;

public class Task1 {

    public static void ageEligibility() {
        Scanner scanner = new Scanner(System.in);

        try {
            int age = scanner.nextInt();
            if(age<16) {
                throw new RuntimeException();
            }else {
                System.out.println("You are eligible");
            }
        } catch (RuntimeException e){
            System.out.println("Exception occured: "+e.getStackTrace());
        }

    }

    public static void main(String[] args) {

        ageEligibility();
    }
}
