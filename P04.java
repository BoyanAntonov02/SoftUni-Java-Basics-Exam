package SoftUni.myExam;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double sumRakia = 0;
        double sumDegree = 0;

        for (int i = 0; i < days; i++) {

            double amountOfRakia = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

            sumRakia += amountOfRakia;
            sumDegree += (amountOfRakia * degree);

        }


        sumDegree = sumDegree / sumRakia;

        System.out.printf("Liter: %.2f%n", sumRakia);
        System.out.printf("Degrees: %.2f%n", sumDegree);
        if(sumDegree>42)System.out.printf("Dilution with distilled water!");
        else if(sumDegree<38)System.out.printf("Not good, you should baking!");
        else if(sumDegree>=38 && sumDegree <= 42)System.out.printf("Super!");
    }
}
