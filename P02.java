package SoftUni.myExam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTshirt = Double.parseDouble(scanner.nextLine());
        double target = Double.parseDouble(scanner.nextLine());

        double pants = priceTshirt * 0.75;
        double socks = pants * 0.20;
        double buttons = (priceTshirt + pants) * 2;

        double sum = buttons + socks + pants + priceTshirt;
        sum = sum * 0.85;

        double diff = Math.abs(sum-target);

        if(sum>target){
            System.out.printf("Yes, he will earn the world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.", sum);
        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n");
            System.out.printf("He needs %.2f lv. more.", diff);
        }

    }
}
