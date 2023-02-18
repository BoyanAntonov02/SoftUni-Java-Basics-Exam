package SoftUni.myExam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        int sum = 0;

        while(!input.equals("Stop")){


            if(input.equals("sea")){
                sea--;

                if(!(sea<0)) {
                    sum += 680;
                }
            }
            if(input.equals("mountain")){
                mountain--;

                if(!(mountain<0)) {
                    sum += 499;
                }

            }
            if(mountain <= 0 && sea <= 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Profit: %d leva.", sum);

    }
}
