package SoftUni.myExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double procesorD = Double.parseDouble(scanner.nextLine());
       double videocardD = Double.parseDouble(scanner.nextLine());
       double ramD = Double.parseDouble(scanner.nextLine());
       int ramCount = Integer.parseInt(scanner.nextLine());
       double discount = Double.parseDouble(scanner.nextLine());


       double procesorLv = procesorD * 1.57;
       double videocardLv = videocardD * 1.57;
       double ramLv = (ramD * 1.57) * ramCount;



       double procesor = procesorLv - (procesorLv * discount);
       double videocard = videocardLv - (videocardLv * discount);

       double sum = procesor + videocard + ramLv;

        System.out.printf("Money needed - %.2f leva.", sum);
    }
}
