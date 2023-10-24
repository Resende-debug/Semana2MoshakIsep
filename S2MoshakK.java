package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakK {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int limite = ler.nextInt();
        for (int num = 2; num < limite; num++) {


            int count = 0;
            int divisao = 1;
            for (int i = 1; i <= num; i++) {
                divisao = num % i;
                if (divisao == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(num);

            }
        }
    }
}