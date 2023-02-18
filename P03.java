package SoftUni.myExam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilograms = Double.parseDouble(scanner.nextLine());
        String packet = scanner.nextLine();
        int kilometeres = Integer.parseInt(scanner.nextLine());


        double sum = 0;


            if( kilograms < 1 ){
                sum = kilometeres * 1.0 * 0.03;
                if(packet.equals("express")){
                    double addmoney = 0.03 * 0.8;
                    double sumaddmoney = kilograms * 1.0 * addmoney;
                    double plusmoney = kilometeres * 1.0  * sumaddmoney;

                    sum += plusmoney;
                }
            } else if (kilograms < 10) {
                sum = kilometeres * 1.0 * 0.05;
                if(packet.equals("express")){
                    double addmoney = 0.05 * 0.4;
                    double sumaddmoney = kilograms * 1.0 * addmoney;
                    double plusmoney = kilometeres * 1.0  * sumaddmoney;

                    sum += plusmoney;
                }
            } else if (kilograms < 40) {
                sum = kilometeres * 1.0 * 0.1;

                if(packet.equals("express")){
                    double addmoney = 0.1 * 0.05;
                    double sumaddmoney = kilograms * 1.0 * addmoney;
                    double plusmoney = kilometeres * 1.0  * sumaddmoney;

                    sum += plusmoney;
                }
            } else if (kilograms < 90) {
                sum = kilometeres * 1.0 * 0.15;

                if(packet.equals("express")){
                    double addmoney = 0.15 * 0.02;
                    double sumaddmoney = kilograms * 1.0 * addmoney;
                    double plusmoney = kilometeres * 1.0  * sumaddmoney;

                    sum += plusmoney;
                }
            } else if (kilograms <= 150) {
                sum = kilometeres * 1.0 * 0.20;

                if(packet.equals("express")){
                    double addmoney = 0.20 * 0.01;
                    double sumaddmoney = kilograms * 1.0 * addmoney;
                    double plusmoney = kilometeres * 1.0  * sumaddmoney;

                    sum += plusmoney;
                }
            }



        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kilograms, sum);


    }
}
