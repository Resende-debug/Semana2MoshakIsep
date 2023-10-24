package Semana2Moshak;

import java.util.Scanner;

public class S2MoshakL {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int qtNUMEROSPERFEITOS = ler.nextInt();
        for (int i =2; i>qtNUMEROSPERFEITOS; i++) {
            double numeroperfeito  = Math.pow(2  , i-1) * (Math.pow(2 , i) -1);

            System.out.println(numeroperfeito);

        }



    }
}
