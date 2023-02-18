package SoftUni.myExam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int cnt = 0;

        boolean isValid = true;


        for (int i = K; i <= 8; i++) {
            for (int j = 9; j >= L; j--) {
                for (int k = M; k <= 8; k++) {
                    for (int l = 9; l >= N; l--) {
                        if( i % 2 == 0 && k % 2==0 && j % 2 == 1 && l % 2 == 1 && isValid ){
                            if(i==k && j==l){
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                cnt++;
                                if(cnt==6){isValid = false;}
                            }


                            }
                        }

                    }

                }

            }

        }

    }
